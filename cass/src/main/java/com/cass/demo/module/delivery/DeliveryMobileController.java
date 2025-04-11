package com.cass.demo.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.income.IncomeService;
import com.cass.demo.module.income.IncomeVo;



@Controller
@RequestMapping(value = "/mobileXdm/delivery")
public class DeliveryMobileController extends BaseController {
	
	@Autowired
	DeliveryService deliveryService;
	
	@Autowired
	IncomeService incomeService;
	
	@RequestMapping(value = "/DeliveryMobileXdmList")
	public String outcomeXdmList(Model model, @ModelAttribute("deliVo") DeliveryVo deliveryVo,
			@ModelAttribute("incoVo") IncomeVo incomeVo) throws Exception {		
		utildatetime(deliveryVo);
		
		deliveryVo.setParamsPagingNew(deliveryService.selectOneCount(deliveryVo));
		model.addAttribute("deliList", deliveryService.selectList(deliveryVo));
		
		incomeVo.setParamsPaging(incomeService.selectOneCountForDeli(incomeVo));
		model.addAttribute("incoList", incomeService.selectListForDeli(incomeVo));
		
	    model.addAttribute("activePage", "delivery");
		return "mobileXdm/delivery/DeliveryMobileXdmList";
	}
}
