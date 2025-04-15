package com.cass.demo.module.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
@RequestMapping(value = "/mobileXdm/stock")
public class StockMobileController extends BaseController {

	@Autowired
	StockService stockService;
	
	@RequestMapping(value = "/StockXdmList")
	public String stockXdmList(@ModelAttribute("vo") StockVo vo, Model model) {
		utildatetime(vo);
		vo.setParamsPaging(stockService.selectOneCount(vo));
		model.addAttribute("list", stockService.selectListStock(vo));
		model.addAttribute("activePage", "stock");
		return "mobileXdm/stock/StockXdmList";
	}
	
//	@RequestMapping(value = "/StockXdmHistory")
//	public String stockXdmHistory(@ModelAttribute("vo") StockVo vo, Model model) {
//		utildatetime(vo);
//		vo.setParamsPaging(stockService.selectOneCount(vo));
//		model.addAttribute("list", stockService.selectList(vo));
//		model.addAttribute("activePage", "sthistory");
//		return "mobileXdm/stock/StockXdmHistory";
//	}
}
