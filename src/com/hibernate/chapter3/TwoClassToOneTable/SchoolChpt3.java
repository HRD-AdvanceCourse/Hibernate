package com.hibernate.chapter3.TwoClassToOneTable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SchoolChpt3 {
	
	@Id
	@GeneratedValue
	private int schoolId;
	private String schoolName;

	
	private SchoolDetailChpt3 schoolDetail;
	
	// step 1: embed schooldetail in school class, step2 go to school detail class add @Embeddable above class
	@Embedded 
	public SchoolDetailChpt3 getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(SchoolDetailChpt3 schoolDetail) {
		this.schoolDetail = schoolDetail;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
