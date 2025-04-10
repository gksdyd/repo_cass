package com.cass.demo.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
@RequestMapping(value = "/delivery")
public class DeliveryXdmController extends BaseController{
	
	@Autowired
	DeliveryService deliveryService;
	
	@RequestMapping(value = "/DeliveryXdmList")
	public String partXdmList(Model model, @ModelAttribute("vo") DeliveryVo vo) {
		utildatetime(vo);
		
		vo.setParamsPaging(deliveryService.selectOneCount(vo));

		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", deliveryService.selectList(vo));
		}

		model.addAttribute("vo", vo);
		
		return "xdm/delivery/DeliveryXdmList";
	}
	

}
