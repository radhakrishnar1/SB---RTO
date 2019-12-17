package com.example.ownercontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.ownerdomain.VehicleDetailsForm;
import com.example.service.impl.OwnerEntityServiceImpl;
@Controller
public class VehDtlsController {
	@Autowired
	private OwnerEntityServiceImpl ownerServiceImpl;

	@RequestMapping(value="/displayVehicleDetailsForm", method=RequestMethod.GET)
	public String displayVehicleDetailsForm(HttpServletRequest req,Model model) {
		String id = req.getParameter("id");
		VehicleDetailsForm vehicleDetails=new VehicleDetailsForm();
		vehicleDetails.setId(Integer.parseInt(id));
		model.addAttribute("vehicleDetailsObj", vehicleDetails);
		return "VehOwnDtls";
	}
	@RequestMapping(value="/saveVehicleDetails",method=RequestMethod.POST)
	private String saveVehicleDetailsForm(@ModelAttribute("vehicleDetailsObj") VehicleDetailsForm vehicleDetails,Model model) {
		Integer id = ownerServiceImpl.saveVehicleDetails(vehicleDetails);
		return "redirect:/displayOwnerForm?id="+id;
	}
}
