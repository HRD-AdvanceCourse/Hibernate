package n01.main.java;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Student_Info_Demo") // rename table
public class StudentInfoDemo {
	@Id 
	
	/* default hibernate will choose GenerationType depend on db
	 	example Oracle will choose Sequence, MySql go for Identity
	 	if you not sure go to Auto
	 */	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int rollNo;

	// @Transient use for hide col(not clear)
	@Column(name = "FULL_NAME", nullable = false)
	// name = rename column, nullable = make column not null
	private String name;

	@Temporal(TemporalType.DATE) // Timestamp format for date
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
