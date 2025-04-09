package com.cass.demo.module.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "mobileXdm/index")
public class MobileIndexController {

	@RequestMapping(value = "/IndexXdmView")
	public String indexXdmView() {
		return "mobileXdm/index/IndexXdmView";
	}
}
