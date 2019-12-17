package com.example.service;



import com.example.ownerEntity.OwnerEntity;
import com.example.ownerdomain.OwnerAddresForm;
import com.example.ownerdomain.OwnerDomain;
import com.example.ownerdomain.VehicleDetailsForm;


public interface IOwnerEntityService {

	public OwnerEntity saveownerDetails(OwnerDomain ownerDomain);

	public Integer saveVehOwnerAddress(OwnerAddresForm ownerAddresForm);
	public Integer saveVehicleDetails(VehicleDetailsForm vehicleDetailsForm);
}



