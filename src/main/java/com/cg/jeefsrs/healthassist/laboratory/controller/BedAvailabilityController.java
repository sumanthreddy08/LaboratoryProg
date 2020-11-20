package com.cg.jeefsrs.healthassist.laboratory.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jeefsrs.healthassist.laboratory.model.BedAvailability;
import com.cg.jeefsrs.healthassist.laboratory.service.BedAvailabilityService;

@RestController
public class BedAvailabilityController {
	
	@Autowired 
	private BedAvailabilityService bedAvailabilityService;
	
	@PutMapping("/updateBedAvailability")
	public BedAvailability updateBedAvailability(@RequestBody BedAvailability bedAvailability)
	  {
		return bedAvailabilityService.updateBedAvailability(bedAvailability);
	  }	
}	
//	@GetMapping("/getAllBedAvailables")
//	 public List<BedAvailable> getAllBedAvailables(){
//		 return (List<BedAvailable>) medicalTestService.getAllBedAvailables();
//		 }
//	 
//	@PostMapping("/addBedAvailable")
//	 public BedAvailable addBedAvailable(@RequestBody BedAvailable medicalTest){
//		 return medicalTestService.addBedAvailable(medicalTest);
//		 }
//	 
//	 @PutMapping("/editBedAvailable")
//	 public BedAvailable editBedAvailable(@PathVariable Integer medicalTest_Id,@PathVariable String medicalTest_Name, @PathVariable  LocalDateTime medicalTest_Time,@PathVariable double medicalTest_Cost){
//		 return medicalTestService.editBedAvailable(medicalTest_Id,medicalTest_Name,medicalTest_Time,medicalTest_Cost);
//		 }
//	 
//	 @DeleteMapping("/deleteBedAvailableById/bed/{bedId}")
//	 public boolean removeBedAvailable(@PathVariable Integer medicalTest_Id){
//		 return medicalTestService.removeBedAvailable(medicalTest_Id);
//		 }
