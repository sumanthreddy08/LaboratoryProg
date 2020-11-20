package com.cg.jeefsrs.healthassist.laboratory.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jeefsrs.healthassist.laboratory.model.BedAvailability;
import com.cg.jeefsrs.healthassist.laboratory.repositories.BedAvailabilityRepository;
import com.cg.jeefsrs.healthassist.laboratory.service.BedAvailabilityService;


@Service
@Transactional
public class BedAvailabilityServiceImpl implements BedAvailabilityService{

	@Autowired
	public BedAvailabilityRepository bedAvailabilityRepository;
	@Override
	public BedAvailability updateBedAvailability(BedAvailability ba) {
		if (bedAvailabilityRepository.findById(ba.getBedId()) != null) {
			return bedAvailabilityRepository.save(ba);
		}

		else {
			return null;
		}
	}
}
//	@Autowired
//	private BedAvailableRepository medicalTestRepository;
//
//	@Override
//	public BedAvailable addBedAvailable(BedAvailable medical) {
//		
//		return medicalTestRepository.save(medical);
//	}
// 
//	@Override
//	public BedAvailable editBedAvailable(Integer medicalTest_Id, String medicalTest_Name, LocalDateTime medicalTest_Time,
//			double medicalTest_Cost) {
//		BedAvailable medicalTest=new BedAvailable();
//		medicalTest.setBedAvailable_Id(medicalTest_Id);
//		medicalTest.setBedAvailable_Name(medicalTest_Name);
//		medicalTest.setBedAvailable_Time(medicalTest_Time);
//		medicalTest.setBedAvailable_Cost(medicalTest_Cost);
//
//		return medicalTestRepository.save(medicalTest);
//	}
//
//	@Override
//	public boolean removeBedAvailable(Integer medicalTest_Id) {
//		medicalTestRepository.deleteById(medicalTest_Id);
//		BedAvailable medicalTest=medicalTestRepository.findById(medicalTest_Id).get();
//		boolean flag=false;
//		 if(null == medicalTest){
//	            flag=true;
//	        }
//	        flag=false;
//	        
//	        return flag;
//	}
//
//	@Override
//	public List<BedAvailable> getAllBedAvailables() {
//		return medicalTestRepository.findAll();
//	}
