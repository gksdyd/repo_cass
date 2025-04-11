package com.cass.demo.module.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/ProductXdmList")
	public String productXdmList(Model model, @ModelAttribute("vo") ProductVo vo) {
		vo.setParamsPaging(productService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
		model.addAttribute("list", productService.selectList(vo));
		}
		
		return "xdm/product/ProductXdmList";
	}
}
