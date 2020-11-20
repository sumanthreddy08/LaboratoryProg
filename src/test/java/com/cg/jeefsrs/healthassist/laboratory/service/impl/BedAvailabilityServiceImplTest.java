package com.cg.jeefsrs.healthassist.laboratory.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.cg.jeefsrs.healthassist.laboratory.model.BedAvailability;


class BedAvailabilityServiceImplTest {

	BedAvailability BedA1=new BedAvailability(10,"yes");
	
	BedAvailabilityServiceImpl bedAvailabilityServiceImpl=mock(BedAvailabilityServiceImpl.class);
	@Test
	void updateBed()
	{
		when(bedAvailabilityServiceImpl.updateBedAvailability(BedA1)).thenReturn(BedA1);
		assertEquals(BedA1,bedAvailabilityServiceImpl.updateBedAvailability(BedA1));
	}

}
