package com.cass.demo.module.productorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;



@Controller
@RequestMapping(value = "/product")
public class ProductOrderController extends BaseController {
	
	@Autowired
	ProductOrderService productOrderService;
	
	@RequestMapping(value = "/ProductOrderXdmList")
	public String productXdmList(Model model, ProductOrderVo vo, ProductOrderDto dto) {
		utildatetime(vo);
		
		vo.setParamsPaging(productOrderService.selectOneCount(vo));

		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", productOrderService.selectList(vo));
		}

		model.addAttribute("vo", vo);
		
		return "xdm/productorder/ProductOrderXdmList";
	}

}
