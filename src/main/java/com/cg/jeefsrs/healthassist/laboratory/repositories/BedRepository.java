package com.cg.jeefsrs.healthassist.laboratory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.jeefsrs.healthassist.laboratory.model.Bed;

@Repository
public interface BedRepository extends JpaRepository<Bed, Integer>{

}




