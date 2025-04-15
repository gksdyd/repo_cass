package com.cass.demo.module.productorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
@RequestMapping(value = "/mobileXdm/productorder")
public class ProductOrderMobilController extends BaseController {

	@Autowired
	ProductOrderService orderService;
	
	@RequestMapping(value = "/ProductOrderXdmList")
	public String productOrderXdmList(@ModelAttribute("orderVo") ProductOrderVo orderVo, Model model) {
		utildatetime(orderVo);
		
		orderVo.setParamsPaging(orderService.selectOneCountForMafa(orderVo));
		model.addAttribute("orderList", orderService.selectListForMafa(orderVo));
		
		model.addAttribute("activePage", "productOrder");
		
		return "mobileXdm/productorder/ProductOrderXdmList";
	}
	
	@RequestMapping(value = "/ProductOrderXdmForm")
	public String manufactureXdmForm(ProductOrderVo pdorVo, Model model) {
		model.addAttribute("list", orderService.selectOneList(pdorVo));
		return "mobileXdm/productorder/ProductOrderXdmForm";
	}
}
