package com.cg.jeefsrs.healthassist.laboratory.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.jeefsrs.healthassist.laboratory.model.Bed;
import com.cg.jeefsrs.healthassist.laboratory.service.BedService;

@RestController
public class BedController {
	@Autowired
	public BedService bedService;
	
	@PostMapping("/addbed")
	public ResponseEntity<Bed> saveBed(@RequestBody Bed bed){
		Bed addedBed = bedService.addBed(bed);
		return new ResponseEntity<Bed>(addedBed, HttpStatus.OK);
	}
	
	@PutMapping("/updatebed")
	public Bed updateBed(@RequestBody Bed bed)
	  {
		return bedService.updateBed(bed);
	  }
	
	@DeleteMapping("/deletebed/{bedId}")
	public ResponseEntity<Bed> deleteBedById(@PathVariable int bedId ){
			Bed res=bedService.deleteBed(bedId);
			return new ResponseEntity<Bed>(res,HttpStatus.OK);
	}
}
//	@Autowired
//	private BedService bedService;
//	 
//	 @GetMapping("/getAllBeds")
//	 public List<Bed> getAllBeds(){
//		 return (List<Bed>) bedService.getAllBeds();
//		 }
//	 
//	 @PostMapping("/addBed")
//	 public Bed addBed(@RequestBody Bed bed){
//		 return bedService.addBed(bed);
//		 }
//	 
//	 @PutMapping("/bed/{id}")
//	 public Bed editBed(@PathVariable Integer bedId,@PathVariable String bedName, @PathVariable long bedPhoneNumber,@PathVariable String bedCategory){
//		 return bedService.editBed(bedId,bedName,bedPhoneNumber,bedCategory);
//		 }
//	 
//	 @DeleteMapping("/deleteBedById/{bedId}")
//	 public boolean deleteBedById(@PathVariable Integer bedId){
//		 return bedService.deleteBedById(bedId); 
//		 }
//}


