package com.example.ownerrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ownerEntity.OwnerEntity;


public interface OwnerRepository extends JpaRepository<OwnerEntity, Integer>{

}
