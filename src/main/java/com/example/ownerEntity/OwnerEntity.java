package com.example.ownerEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="vehicle_owner_dtls")
public class OwnerEntity {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	private long mobileNumber;
	private String gender;

}
