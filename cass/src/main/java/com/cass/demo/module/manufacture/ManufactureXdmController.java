package com.cass.demo.module.manufacture;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.productorder.ProductOrderDto;
import com.cass.demo.module.productorder.ProductOrderService;
import com.cass.demo.module.productorder.ProductOrderVo;

@Controller
@RequestMapping(value = "/mobileXdm/manufacture")
public class ManufactureXdmController extends BaseController {
	
	@Autowired
	ManufactureService service;
	
	@Autowired
	ProductOrderService orderService;
	
	@RequestMapping(value = "/ManufactureXdmList")
	public String manufactureXdmForm(@ModelAttribute("manuVo") ManufactureVo manufactureVo, Model model) {
		utildatetime(manufactureVo);
		
		manufactureVo.setParamsPaging(service.selectOneCount(manufactureVo));
		model.addAttribute("manuList", service.selectList(manufactureVo));
		
		model.addAttribute("activePage", "manufacture");
		
		return "mobileXdm/manufacture/ManufactureXdmList";
	}
	
	@ResponseBody
	@RequestMapping(value = "/MafaRegisterProc")
	public void mafaRegisterProc(ProductOrderVo vo) {
		Integer maxMafaNum;
		
		vo.setPdorStatusCd(4);
		orderService.updateOrder(vo);
		
		List<ProductOrderDto> dtos = orderService.selectOneList(vo);
		maxMafaNum = service.maxMafaNum();
		for (int i = 0; i < dtos.size(); i++) {
			maxMafaNum++;
			dtos.get(i).setPdorNum(vo.getPdorNum());
			dtos.get(i).setMafaNum(maxMafaNum.toString());
			service.insert(dtos.get(i));
		}
		return;
	}
	
	@ResponseBody
	@RequestMapping(value = "/MafaCompleteProc")
	public void mafaCompleteProc(ManufactureDto dto) {
		dto.setMafaStausCd(10);
		service.update(dto);
		
		return;
	}
}