package com.cass.demo.module.manufacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.productorder.ProductOrderService;
import com.cass.demo.module.productorder.ProductOrderVo;

@Controller
@RequestMapping(value = "/mobileXdm/manufacture")
public class ManufactureXdmController extends BaseController {
	
	@Autowired
	ManufactureService service;
	
	@Autowired
	ProductOrderService orderService;
	
	@RequestMapping(value = "/ManufactureXdmList")
	public String manufactureXdmForm(@ModelAttribute("manuVo") ManufactureVo manufactureVo, 
			@ModelAttribute("orderVo") ProductOrderVo orderVo, Model model) {
		utildatetime(manufactureVo);
		
		manufactureVo.setParamsPaging(service.selectOneCount(manufactureVo));
		model.addAttribute("manuList", service.selectList(manufactureVo));
		
		orderVo.setParamsPagingNew(orderService.selectOneCountForMafa(orderVo));
		model.addAttribute("orderList", orderService.selectListForMafa(orderVo));
		
		model.addAttribute("activePage", "manufacture");
		
		return "mobileXdm/manufacture/ManufactureXdmList";
	}
	
	@RequestMapping(value = "/ManufactureXdmForm")
	public String orderDetailProc(ProductOrderVo pdorVo, Model model) {
		model.addAttribute("list", orderService.selectOneList(pdorVo));
		return "mobileXdm/manufacture/ManufactureXdmForm";
	}
}