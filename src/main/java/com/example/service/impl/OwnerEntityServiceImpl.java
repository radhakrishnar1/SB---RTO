package com.example.service.impl;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ownerEntity.OwnerAddresFormEntity;
import com.example.ownerEntity.OwnerEntity;
import com.example.ownerEntity.VehicleDetailsFormEntity;
import com.example.ownerdomain.OwnerAddresForm;
import com.example.ownerdomain.OwnerDomain;
import com.example.ownerdomain.VehicleDetailsForm;
import com.example.ownerrepo.OwnerAddressRepo;
import com.example.ownerrepo.OwnerRepository;
import com.example.ownerrepo.VehDtlsRepo;
import com.example.service.IOwnerEntityService;
@Service
public class OwnerEntityServiceImpl implements IOwnerEntityService {

	@Autowired
	private OwnerRepository ownerDtlsRepo;
	@Autowired
	private OwnerAddressRepo ownerAddressRepo;
	@Autowired
	private VehDtlsRepo vehDtlsRepo;


	@Override
	public OwnerEntity saveownerDetails(OwnerDomain ownerDomain) {
		//logic to insert data
		OwnerEntity entity= new OwnerEntity();
		System.out.println("Id: "+entity.getId());
		BeanUtils.copyProperties(ownerDomain,entity);
		OwnerEntity ownerEntity=ownerDtlsRepo.save(entity);
		return ownerEntity;
	}

	@Override
	public Integer saveVehOwnerAddress(OwnerAddresForm ownerAddresForm) {
		OwnerAddresFormEntity entity=new OwnerAddresFormEntity();
		BeanUtils.copyProperties(ownerAddresForm, entity);
		OwnerEntity ownerEntity=new OwnerEntity();
		ownerEntity.setId(ownerAddresForm.getId());
		entity.setOwner(ownerEntity);
	    ownerAddressRepo.save(entity);
		return ownerAddresForm.getId();
	}

	
	@Override
	public Integer saveVehicleDetails(VehicleDetailsForm vehicleDetailsForm) {
		VehicleDetailsFormEntity vehicleDetailsEntity=new VehicleDetailsFormEntity();
		BeanUtils.copyProperties(vehicleDetailsForm, vehicleDetailsEntity);
		OwnerEntity ownerEntity=new OwnerEntity();
		ownerEntity.setId(vehicleDetailsEntity.getId());
		vehicleDetailsEntity.setOwner(ownerEntity);
		vehDtlsRepo.save(vehicleDetailsEntity);
		return vehicleDetailsForm.getId();
	}


	/*	@Override
	public VehicleDetailsFormEntity saveVehicleDetails(VehicleDetailsForm vehicleDetailsForm) {
		VehicleDetailsFormEntity entity=new VehicleDetailsFormEntity();
		BeanUtils.copyProperties(vehicleDetailsForm, entity);
		return ""+ vehDtlsRepo.save(entity);
	}*/
}