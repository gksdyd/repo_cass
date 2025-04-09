package com.cass.demo.module.delivery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mobileXdm/delivery")
public class DeliveryController {
	
	@RequestMapping(value = "/DeliveryXdmList")
	public String outcomeXdmList() {
		
		return "mobileXdm/delivery/DeliveryXdmList";
	}

}
