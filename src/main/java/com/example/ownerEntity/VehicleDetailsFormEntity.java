package com.example.ownerEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="veh_dtls_form")
public class VehicleDetailsFormEntity {

	
	@Id
	@GeneratedValue
	private int id;
	private String vehType;
	private String vehCmpName;
	private long vehMfcYear;
	private String vehColor;
	@OneToOne
	@JoinColumn(name="OWNER_ID")
	private OwnerEntity owner;
}
