package com.cass.demo.module.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.productorder.ProductOrderDto;
import com.cass.demo.module.productorder.ProductOrderService;
import com.cass.demo.module.productorder.ProductOrderVo;



@Controller
@RequestMapping(value = "/mobileXdm/delivery")
public class DeliveryMobileController extends BaseController {
	
	@Autowired
	DeliveryService deliveryService;
	
	@Autowired
	ProductOrderService orderService;
	
	@RequestMapping(value = "/DeliveryMobileXdmList")
	public String outcomeXdmList(Model model, @ModelAttribute("deliVo") DeliveryVo deliveryVo,
			@ModelAttribute("orderVo") ProductOrderVo orderVo) throws Exception {	
		int count = 0;
		
		utildatetime(deliveryVo);
		utildatetime(orderVo);
		
		deliveryVo.setParamsPaging(deliveryService.selectOneCount(deliveryVo));
		List<DeliveryDto> list = deliveryService.selectList(deliveryVo);
		for (int i = 0; i < list.size(); i++) {
			String[] qtys = list.get(i).getTotalQtys().split(",");
			list.get(i).setMafaTotalQty(qtys[count]);
			System.out.println(list.get(i).getMafaTotalQty());
			count++;
			if (count == qtys.length) {
				count= 0;
			}
		}
		model.addAttribute("incoList", list);
		
		orderVo.setParamsPagingNew(orderService.selectOneCountForDeli(orderVo));
		model.addAttribute("orderList", orderService.selectListForDeli(orderVo));
		
	    model.addAttribute("activePage", "delivery");
		return "mobileXdm/delivery/DeliveryMobileXdmList";
	}
	
	@RequestMapping(value = "/DeliveryXdmForm")
	public String deliveryXdmForm(ProductOrderVo pdorVo, Model model) {
		model.addAttribute("list", orderService.selectOneList(pdorVo));
		return "mobileXdm/delivery/DeliveryXdmForm";
	}
	
	@ResponseBody
	@RequestMapping(value = "/DeliRegisterProc")
	public void deliRegisterProc(ProductOrderVo vo) {
		Integer maxDeliNum;
		
		vo.setPdorStatusCd(5);
		orderService.updateOrder(vo);
		
		List<ProductOrderDto> dtos = orderService.selectOneList(vo);
		maxDeliNum = deliveryService.deliMaxNum();
		for (int i = 0; i < dtos.size(); i++) {
			maxDeliNum++;
			dtos.get(i).setPdorNum(vo.getPdorNum());
			dtos.get(i).setDeliNum(maxDeliNum.toString());
			deliveryService.insert(dtos.get(i));
		}
	}
}
