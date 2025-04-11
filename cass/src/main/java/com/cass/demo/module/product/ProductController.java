package com.cass.demo.module.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;

@Controller
@RequestMapping(value = "/product")
public class ProductController extends BaseController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/ProductXdmList")
	public String productXdmList(Model model, @ModelAttribute("vo") ProductVo vo) {
		utildatetime(vo);
		
		vo.setParamsPaging(productService.selectOneCount(vo));
		
		if (vo.getTotalRows() > 0) {
		model.addAttribute("list", productService.selectList(vo));
		}
		return "xdm/product/ProductXdmList";
	}
	
	@RequestMapping(value = "/productXdmMfom")
	public String productXdmMfom(Model model, ProductDto productDto) {
		System.out.println("전달할 데이터: " + productService.selectOne(productDto));
		model.addAttribute("item", productService.selectOne(productDto));
		System.out.println("검색할 prdtSeq: " + productDto.getPrdtSeq());
		return "xdm/product/ProductXdmMfom";
	}
	
}
