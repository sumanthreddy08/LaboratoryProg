package com.cg.jeefsrs.healthassist.laboratory.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.cg.jeefsrs.healthassist.laboratory.model.Bed;


class BedServiceImplTest {

	Bed Bed1=new Bed(10,"single", 5);


	BedServiceImpl bedServiceImpl=mock(BedServiceImpl.class);
	@Test
	void addBed() {
		when(bedServiceImpl.addBed(Bed1)).thenReturn(Bed1);
		assertEquals(Bed1,bedServiceImpl.addBed(Bed1));
	}
	@Test
	void updateBed()
	{
		when(bedServiceImpl.updateBed(Bed1)).thenReturn(Bed1);
		assertEquals(Bed1,bedServiceImpl.updateBed(Bed1));
	}
	@Test
	void removeBed() {
		when(bedServiceImpl.deleteBed(10)).thenReturn(Bed1);
		assertEquals(Bed1,bedServiceImpl.deleteBed(10));
	}
}
