package com.cass.demo.module.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.delivery.DeliveryService;
import com.cass.demo.module.delivery.DeliveryVo;

@Controller
@RequestMapping(value = "mobileXdm/index")
public class MobileIndexController extends BaseController {

	@Autowired
	DeliveryService deliveryService;
	
	@RequestMapping(value = "/IndexXdmView")
	public String indexXdmView(@ModelAttribute("vo") DeliveryVo vo, Model model) {
		utildatetime(vo);
		vo.setParamsPaging(deliveryService.selectOneCount(vo));
		model.addAttribute("list", deliveryService.selectList(vo));
		model.addAttribute("activePage", "index");
		return "mobileXdm/index/IndexXdmView";
	}
}
