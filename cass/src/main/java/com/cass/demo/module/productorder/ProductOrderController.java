package com.cass.demo.module.productorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value = "/ProductOrderXdmForm")
	public String productXdmForm(Model model, ProductOrderVo vo, ProductOrderDto dto) {
		
		if (vo.getPdorSeq().equals("0") || vo.getPdorSeq().equals("")) {
//			insert mode
		} else {
//			update mode
			model.addAttribute("item", productOrderService.selectOne(vo));
			model.addAttribute("list", productOrderService.selectedOneList(vo));
			model.addAttribute("temp", productOrderService.selectedTempList(vo));
		}
		return "xdm/productorder/ProductOrderXdmForm";
	}

	@RequestMapping(value = "/ProductOrderXdmUelePdol")
	public String ProductOrderXdmUelePdol(ProductOrderDto dto) {
		productOrderService.ueletePdol(dto);
		return "redirect:/product/ProductOrderXdmForm";
	}
	
	@RequestMapping(value = "/ProductOrderXdmTempInst")
	public String ProductOrderXdmTempInst(ProductOrderDto dto) {
		productOrderService.insertTemp(dto);
		return "redirect:/product/ProductOrderXdmList";
	}
	@RequestMapping(value = "/ProductOrderXdmInst")
	public String ProductOrderXdmInst(ProductOrderDto dto) {
		dto.setPdorNum(productOrderService.selectMaxNum(dto)+1);
		productOrderService.insert(dto);
		dto.setPdorSeq(productOrderService.selectMaxSeq(dto).toString());
		productOrderService.insertOL(dto);
		return "redirect:/product/ProductOrderXdmList";
	}
	@RequestMapping(value = "/ProductOrderXdmUpdt")
	public String ProductOrderXdmUpdt(ProductOrderDto dto) {
		System.out.println(dto.getPdolSeq());
		productOrderService.update(dto);
		return "redirect:/product/ProductOrderXdmList";
	}
}
