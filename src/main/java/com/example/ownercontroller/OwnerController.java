package com.example.ownercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ownerEntity.OwnerEntity;
import com.example.ownerdomain.OwnerDomain;
import com.example.service.impl.OwnerEntityServiceImpl;


@Controller
public class OwnerController {


	@Autowired
	private OwnerEntityServiceImpl ownerservice;


	@RequestMapping("/displayform")
	public String displayOwnerForm(Model model) 
	{
		OwnerDomain  owner = new OwnerDomain();
		model.addAttribute("ownerObj", owner);
		return "ownerForm";
	}


	@RequestMapping(value="/saveOwnerDtls", method=RequestMethod.POST)
	public String saveOwner(@ModelAttribute("ownerObj") OwnerDomain ownerDomain , Model model) {
		OwnerEntity ownerEntity = ownerservice.saveownerDetails(ownerDomain);
		Integer id = ownerEntity.getId();

		return "redirect:/displayOwnAddrForm?id="+id;
	}

}




