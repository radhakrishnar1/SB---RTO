package com.example.ownerrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ownerEntity.OwnerAddresFormEntity;

public interface OwnerAddressRepo extends JpaRepository<OwnerAddresFormEntity, Integer> {

}
