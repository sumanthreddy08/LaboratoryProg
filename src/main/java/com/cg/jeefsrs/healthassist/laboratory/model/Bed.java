package com.cg.jeefsrs.healthassist.laboratory.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name ="Bed")
/** This class used for set and getting the values
 * 
 * @author Sreekanth
 * @version 1.0
 *
 */ 
public class Bed implements Serializable {

	private static final long serialVersionUID=1L;
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bedId")
	private int bedId;
	@Column(name = "bedType", nullable = false)
	private String bedType;
	@Column(name = "totalNumberOfBeds", nullable = false)
	private int totalNumberOfBeds;
	
	public Bed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bed(int bedId, String bedType, int totalNumberOfBeds) {
		super();
		this.bedId = bedId;
		this.bedType = bedType;
		this.totalNumberOfBeds = totalNumberOfBeds;
	}
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}
	public String getBedType() {
		return bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	public int getTotalNumberOfBeds() {
		return totalNumberOfBeds;
	}
	public void setTotalNumberOfBeds(int totalNumberOfBeds) {
		this.totalNumberOfBeds = totalNumberOfBeds;
	}

	
}