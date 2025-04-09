package com.cass.demo.module.dealer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
public class DealerXdmController extends BaseController{
	
	@Autowired
	DealerService dealerService;
	
	@RequestMapping(value = "/dealer/dealerXdmList")
	public String dealerXdmList(DealerVo vo, DealerDto dto, Model model) {
		utildatetime(vo);
		
		vo.setParamsPaging(dealerService.selectOneCount(vo));
		
		model.addAttribute("list", dealerService.selectList(vo));
		model.addAttribute("vo", vo);
		return "xdm/dealer/DealerXdmList";
	}
}

