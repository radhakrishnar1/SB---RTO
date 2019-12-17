package com.example.ownerrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ownerEntity.VehicleDetailsFormEntity;

public interface VehDtlsRepo extends JpaRepository<VehicleDetailsFormEntity, Integer> {

}
