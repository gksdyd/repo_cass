package com.cass.demo.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.dealer.DealerService;
import com.cass.demo.module.product.ProductService;
import com.cass.demo.module.productorder.ProductOrderDto;
import com.cass.demo.module.productorder.ProductOrderService;
import com.cass.demo.module.productorder.ProductOrderVo;

@Controller
@RequestMapping(value = "/delivery")
public class DeliveryXdmController extends BaseController{
	
	@Autowired
	DeliveryService deliveryService;
		
	@Autowired
	ProductOrderService productOrderService;
	
	@RequestMapping(value = "/DeliveryXdmList")
	public String deliveryXdmList(Model model, @ModelAttribute("vo") DeliveryVo vo) {
		utildatetime(vo);
		
		vo.setParamsPaging(deliveryService.selectOneCount(vo));

		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", deliveryService.selectList(vo));
		}

		model.addAttribute("vo", vo);
		
		return "xdm/delivery/DeliveryXdmList";
	}
	
	@RequestMapping(value = "/DeliveryXdmForm")
	public String deliveryXdmForm(Model model, ProductOrderVo vo, ProductOrderDto dto) {
		
		if (vo.getPdorSeq().equals("0") || vo.getPdorSeq().equals("")) {
//			insert mode
		} else {
//			update mode
			model.addAttribute("item", productOrderService.selectOne(vo));
			model.addAttribute("list", productOrderService.selectedOneList(vo));
			model.addAttribute("temp", productOrderService.selectedTempList(vo));
		}
		return "xdm/delivery/DeliveryXdmForm";
	}

}
