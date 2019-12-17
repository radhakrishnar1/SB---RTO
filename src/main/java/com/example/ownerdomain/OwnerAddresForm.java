package com.example.ownerdomain;

import lombok.Data;

@Data
public class OwnerAddresForm {

	private String houseNumber;
	private String streetName;
	private String cityName;
	private Long zipCode;
	private Integer id;

}
