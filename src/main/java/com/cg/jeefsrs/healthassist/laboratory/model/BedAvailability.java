package com.cg.jeefsrs.healthassist.laboratory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BedAvailability")
 
public class BedAvailability implements Serializable {
	
	private static final long serialVersionUID=1L;
	@Id
	private int bedId;
	private String bedAvailable;
	
	
	public BedAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BedAvailability(int bedId, String bedAvailable) {
		super();
		this.bedId = bedId;
		this.bedAvailable = bedAvailable;
	}
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}
	public String getBedAvailable() {
		return bedAvailable;
	}
	public void setBedAvailable(String bedAvailable) {
		this.bedAvailable = bedAvailable;
	}
	
	
	
}
