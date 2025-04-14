package com.cass.demo.module.productorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.dealer.DealerService;
import com.cass.demo.module.product.ProductService;



@Controller
@RequestMapping(value = "/productorder")
public class ProductOrderController extends BaseController {
	
	@Autowired
	ProductOrderService productOrderService;
	
	@Autowired
	DealerService dealerService;
	
	@Autowired
	ProductService productService;
	
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
	public String productXdmForm(Model model, @ModelAttribute("vo") ProductOrderVo vo, ProductOrderDto dto) {
		model.addAttribute("dealerList", dealerService.selectListDealerName());
		model.addAttribute("productList", productService.selectListProduct());
		if (vo.getPdorSeq().equals("0") || vo.getPdorSeq().equals("")) {
			Integer maxSeq = productOrderService.selectMaxSeq();
			if (maxSeq == null) {
				maxSeq = 1;
			}
			dto.setPdorSeq((++maxSeq).toString());
			Integer maxNum = productOrderService.selectMaxNum();
			if (maxNum == null) {
				maxNum = 1001;
			}
			dto.setPdorNum(maxNum + 1);
			model.addAttribute("item", dto);
		} else {
//			update mode
			vo.setFlag(1);
			List<ProductOrderDto> dtos = productOrderService.selectOrderList(dto);
			for (int i = 0; i < dtos.size(); i++) {
				dto.getScaleNameArray().add(dtos.get(i).getPrdtName());
				dto.getScaleCountArray().add(dtos.get(i).getPdolQty());
			}
			model.addAttribute("item", productOrderService.selectOne(vo));
			model.addAttribute("dto", dto);
		}
		return "xdm/productorder/ProductOrderXdmForm";
	}

	@RequestMapping(value = "/ProductOrderXdmUelePdol")
	public String ProductOrderXdmUelePdol(ProductOrderDto dto) {
		productOrderService.ueletePdol(dto);
		return "redirect:/product/ProductOrderXdmForm";
	}
	
	@RequestMapping(value = "/ProductOrderXdmInst")
	public String ProductOrderXdmInst(ProductOrderDto dto) {
		productOrderService.insert(dto);
		
		for (int i = 0; i < dto.getScaleNameArray().size(); i++) {
			dto.setPdolQty(dto.getScaleCountArray().get(i));
			dto.setPrdtName(dto.getScaleNameArray().get(i));
			productOrderService.insertOrderList(dto);
		}
		return "redirect:/productorder/ProductOrderXdmList";
	}
	
	@RequestMapping(value = "/ProductOrderXdmUpdt")
	public String ProductOrderXdmUpdt(ProductOrderDto dto) {
		productOrderService.update(dto);
		
		List<ProductOrderDto> dtos = productOrderService.selectOrderList(dto);
		int count = dtos.size();
		int size = count;
		int flag = 0;
		
		// 사료의 정보 갯수 증가, 감소 여부 체크
		if (dto.getScaleNameArray().size() > count) {
			size = dto.getScaleNameArray().size();
			flag = 1;
		} else if (dto.getScaleNameArray().size() < count) {
			flag = -1;
		}
		
		// 사료의 정보 갯수 증가, 감소에 따른 insert, update, delete
		for (int i = 0; i < size; i++) {
			if (flag == -1) {
				if (i < dto.getScaleNameArray().size()) {
					dto.setPdolSeq(dtos.get(i).getPdolSeq());
					dto.setPdolQty(dto.getScaleCountArray().get(i));
					dto.setPrdtName(dto.getScaleNameArray().get(i));
					productOrderService.updateOrderList(dto);				
				} else {
					dto.setPdolSeq(dtos.get(i).getPdolSeq());
					productOrderService.deletOrderList(dto);	
				}
			} else if (flag == 1) {
				if (i < count) {
					dto.setPdolSeq(dtos.get(i).getPdolSeq());
					dto.setPdolQty(dto.getScaleCountArray().get(i));
					dto.setPrdtName(dto.getScaleNameArray().get(i));
					productOrderService.updateOrderList(dto);			
				} else {
					dto.setPdolQty(dto.getScaleCountArray().get(i));
					dto.setPrdtName(dto.getScaleNameArray().get(i));
					productOrderService.insertOrderList(dto);
				}
			} else if (flag == 0) {
				dto.setPdolSeq(dtos.get(i).getPdolSeq());
				dto.setPdolQty(dto.getScaleCountArray().get(i));
				dto.setPrdtName(dto.getScaleNameArray().get(i));
				productOrderService.updateOrderList(dto);
			}
		}
		return "redirect:/productorder/ProductOrderXdmList";
	}
}
