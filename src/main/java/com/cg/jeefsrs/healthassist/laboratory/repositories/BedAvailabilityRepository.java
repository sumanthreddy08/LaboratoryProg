package com.cg.jeefsrs.healthassist.laboratory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.jeefsrs.healthassist.laboratory.model.BedAvailability;

public interface BedAvailabilityRepository extends JpaRepository<BedAvailability,Integer> {

}
