package com.cass.demo.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;



@Controller
@RequestMapping(value = "/mobileXdm/delivery")
public class DeliveryController extends BaseController {
	
	@Autowired
	DeliveryService deliveryService;
	
	@RequestMapping(value = "/DeliveryXdmList")
	public String outcomeXdmList(Model model, DeliveryVo vo, DeliveryDto dto) throws Exception {		
		utildatetime(vo);
		
		vo.setParamsPaging(deliveryService.selectOneCount(vo));

		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", deliveryService.selectList(vo));
		}

		model.addAttribute("vo", vo);
		
		return "mobileXdm/delivery/DeliveryXdmList";
	}

}
