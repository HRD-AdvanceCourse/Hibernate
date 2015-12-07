package com.hibernate.manyToOneMapping;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTADDRESS")
public class StudentAddress {

	@Id
	@GeneratedValue
	private int address_id;

	private String address_detail;

	// Step 2: Add a collection of student class
	// Here is one to Many
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "studentAddress")
	private Set<Student> student = new HashSet<Student>(0);

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getAddress_detail() {
		return address_detail;
	}

	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}

}
