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
import com.cass.demo.module.stock.StockService;



@Controller
@RequestMapping(value = "/mobileXdm/delivery")
public class DeliveryMobileController extends BaseController {
	
	@Autowired
	DeliveryService deliveryService;
	
	@Autowired
	ProductOrderService orderService;
	
	@Autowired
	StockService stockService;
	
	@RequestMapping(value = "/DeliveryMobileXdmList")
	public String outcomeXdmList(Model model, @ModelAttribute("orderVo") ProductOrderVo orderVo) throws Exception {	
		utildatetime(orderVo);
		
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
			
			Integer temp = stockService.selectOneProductTotalQty(dtos.get(i));
			if (temp == null) {
				return;
			} else {
				dtos.get(i).setStckTotalQty(temp);				
			}
			stockService.insertForDeli(dtos.get(i));
		}
	}
}
