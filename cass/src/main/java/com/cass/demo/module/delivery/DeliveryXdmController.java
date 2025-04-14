package com.cass.demo.module.delivery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cass.demo.base.xdm.BaseController;
import com.cass.demo.module.dealer.DealerService;
import com.cass.demo.module.income.IncomeDto;
import com.cass.demo.module.product.ProductService;
import com.cass.demo.module.productorder.ProductOrderDto;
import com.cass.demo.module.productorder.ProductOrderService;
import com.cass.demo.module.productorder.ProductOrderVo;

@Controller
@RequestMapping(value = "/delivery")
public class DeliveryXdmController extends BaseController{
	
	@Autowired
	DeliveryService deliveryService;
		
	@Autowired
	ProductOrderService productOrderService;
	
	@RequestMapping(value = "/DeliveryXdmList")
	public String deliveryXdmList(Model model, @ModelAttribute("vo") DeliveryVo vo) {
		utildatetime(vo);
		
		vo.setParamsPaging(deliveryService.selectOneCount(vo));

		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", deliveryService.selectList(vo));
		}

		model.addAttribute("vo", vo);
		
		return "xdm/delivery/DeliveryXdmList";
	}
	
	@RequestMapping(value = "/DeliveryXdmView")
	public String deliveryXdmView(Model model, DeliveryDto dto) {
		
		model.addAttribute("item", deliveryService.selectOne(dto));
		
		return "xdm/delivery/DeliveryXdmView";
	}

}
