package com.cass.demo.module.dealer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping(value = "/dealer/dealerXdmForm")
	public String dealerXdmForm(@ModelAttribute("vo") DealerVo vo, DealerDto dto, Model model) {
		if (vo.getDealSeq().equals("0") || vo.getDealSeq().equals("")) {
//			insert mode
		} else {
//			update mode
			model.addAttribute("item", dealerService.selectOne(vo));
		}
		return "xdm/dealer/DealerXdmForm";
	}
	
	@RequestMapping(value = "/dealer/dealerXdmMfom")
	public String dealerXdmMfom(Model model, DealerDto dealerDto) {
		System.out.println("전달할 데이터: " + dealerService.selectOne(dealerDto));
		model.addAttribute("item", dealerService.selectOne(dealerDto));
		return "xdm/dealer/DealerXdmMfom";
	}
	
	@RequestMapping(value = "/dealer/dealerXdmInst")
	public String dealerXdmInst(DealerDto dealerDto) {
		dealerService.insert(dealerDto);
		return "redirect:/dealer/dealerXdmList";
	}
	
	@RequestMapping(value = "/dealer/dealerXdmUpdt")
	public String dealerXdmUpdt(DealerDto dealerDto) {
		dealerService.update(dealerDto);
		return "redirect:/dealer/dealerXdmList";
	}
	
	@RequestMapping(value = "/dealer/dealerXdmUele")
	public String dealerXdmUele(DealerDto dealerDto) {
		dealerService.uelete(dealerDto);
		return "redirect:/dealer/dealerXdmList";
	}
}

