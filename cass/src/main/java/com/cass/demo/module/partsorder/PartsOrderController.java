package com.cass.demo.module.partsorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.parts.PartsVo;

@Controller
@RequestMapping(value = "/parts")
public class PartsOrderController extends BaseController {
	
	@Autowired
	PartsOrderService partsOrderService;

	@RequestMapping(value = "/PartsOrderXdmList")
	public String partXdmList(Model model, @ModelAttribute("vo") PartsOrderVo vo) {
		utildatetime(vo);
		
		vo.setParamsPaging(partsOrderService.selectOneCount(vo));

		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", partsOrderService.selectList(vo));
		}

		model.addAttribute("vo", vo);
		
		return "xdm/partsorder/PartsOrderXdmList";
	}
}
