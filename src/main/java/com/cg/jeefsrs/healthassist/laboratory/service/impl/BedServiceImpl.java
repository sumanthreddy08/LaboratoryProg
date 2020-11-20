package com.cg.jeefsrs.healthassist.laboratory.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.jeefsrs.healthassist.laboratory.model.Bed;
import com.cg.jeefsrs.healthassist.laboratory.repositories.BedRepository;
import com.cg.jeefsrs.healthassist.laboratory.service.BedService;

@Service
@Transactional
public class BedServiceImpl implements BedService{
	
	@Autowired
	public BedRepository bedRepository;
	
	public Bed addBed(Bed bedId) {
		return bedRepository.save(bedId);
	}
	public Bed updateBed(Bed bed) {
		if (bedRepository.findById(bed.getBedId()) != null) {
			return bedRepository.save(bed);
		}

		else {
			return null;
		}
	}
	public Bed deleteBed(int bedId) {
		Bed deleteproposal= bedRepository.findById(bedId).orElse(new Bed());
		bedRepository.deleteById(bedId);;
		 return deleteproposal;
	}	
}