package com.example.ownercontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ownerdomain.OwnerAddresForm;
import com.example.service.impl.OwnerEntityServiceImpl;

@Controller
public class OwnerAddressController {
@Autowired
	private OwnerEntityServiceImpl ownerEntityServiceImpl;
	
	@RequestMapping(value="/displayOwnAddrForm")
	public String displayOwnAddrsform(HttpServletRequest req,Model model){
	 String id = req.getParameter("id");

		OwnerAddresForm ownerAddresForm = new OwnerAddresForm();
		ownerAddresForm.setId(Integer.parseInt(id));

		model.addAttribute("ownerAddrObj", ownerAddresForm );
		return "ownerAddrForm";
	
	}
	
	@RequestMapping(value="/saveVehOwnerAddress",method=RequestMethod.POST)
	public String saveVehOwnerAddress(@ModelAttribute("ownerAddrObj") OwnerAddresForm ownerAddresForm,Model model) {
		Integer id=	ownerEntityServiceImpl.saveVehOwnerAddress(ownerAddresForm);
		return "redirect:/displayVehicleDetailsForm?id="+id;
		
				
	}
}
