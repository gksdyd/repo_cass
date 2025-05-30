package com.cass.demo.module.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
@RequestMapping(value = "/stock")
public class StockXdmController extends BaseController {

	@Autowired
	StockService stockService;
	
	@RequestMapping(value = "/StockXdmList")
	public String stockXdmList(@ModelAttribute("vo") StockVo vo, Model model) {
		utildatetime(vo);
		vo.setParamsPaging(stockService.selectOneCount(vo));
		model.addAttribute("list", stockService.selectList(vo));
		return "xdm/stock/StockXdmList";
	}
}
