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
@Table(name="owner_addr_dtls")
public class OwnerAddresFormEntity {

	@Id
	@GeneratedValue
	private int id;
	private String houseNumber;
	private String streetName;
	private String cityName;
	private Long zipCode;
	@OneToOne
	@JoinColumn(name = "id")
	private OwnerEntity owner;
}
