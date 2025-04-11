package com.cass.demo.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;



@Controller
@RequestMapping(value = "/mobileXdm/delivery")
public class DeliveryMobileController extends BaseController {
	
	@Autowired
	DeliveryService deliveryService;
	
	@RequestMapping(value = "/DeliveryMobileXdmList")
	public String outcomeXdmList(Model model, @ModelAttribute("vo") DeliveryVo vo) throws Exception {		
		utildatetime(vo);
		vo.setParamsPaging(deliveryService.selectOneCount(vo));
		model.addAttribute("list", deliveryService.selectList(vo));
	    model.addAttribute("activePage", "delivery");
		return "mobileXdm/delivery/DeliveryMobileXdmList";
	}
}
