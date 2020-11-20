package com.cg.jeefsrs.healthassist.laboratory.service;


import com.cg.jeefsrs.healthassist.laboratory.model.Bed;

public interface BedService {
//	public Bed addBed(Bed bed);
//	
//	public Bed editBed(Integer bedId,String bedName,long bedPhoneNumber,String bedCategory);
//
//	public boolean deleteBedById(Integer bedId);
//	
//	public List<Bed> getAllBeds();
//
//	public Bed findBedById(Integer bedId);

	public Bed addBed(Bed bedId);
	public Bed updateBed(Bed bed);
	public Bed deleteBed(int bedId);


}
