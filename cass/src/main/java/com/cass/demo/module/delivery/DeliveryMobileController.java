package com.cass.demo.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.income.IncomeService;
import com.cass.demo.module.income.IncomeVo;
import com.cass.demo.module.productorder.ProductOrderService;
import com.cass.demo.module.productorder.ProductOrderVo;



@Controller
@RequestMapping(value = "/mobileXdm/delivery")
public class DeliveryMobileController extends BaseController {
	
	@Autowired
	DeliveryService deliveryService;
	
	@Autowired	
	IncomeService incomeService;
	
	@Autowired
	ProductOrderService orderService;
	
	@RequestMapping(value = "/DeliveryMobileXdmList")
	public String outcomeXdmList(Model model, @ModelAttribute("incoVo") IncomeVo incoVo,
			@ModelAttribute("orderVo") ProductOrderVo orderVo) throws Exception {		
		utildatetime(incoVo);
		
		incoVo.setParamsPaging(incomeService.selectOneCountForDeli(incoVo));
		model.addAttribute("incoList", incomeService.selectListForDeli(incoVo));
		
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
}
