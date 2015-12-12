package n03.com.hibernate.oneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "N03_Student_Detail") // rename table
public class N03_StudentDetail {

	/* Step 2: in this session is tell hibernate that do not generate id for foreign table */
	@Id @GeneratedValue(generator = "newGenerator") // name of the primary key generator
	
	// all value of student id is depend on student class
	@GenericGenerator(name = "newGenerator", strategy = "foreign", parameters = {
			@Parameter(value = "student", name = "property") })
	private int student_id;

	private String student_mobile_number;

	
	// Step 1: add these two annotation above Parent table object and getter setter
	@OneToOne(cascade = CascadeType.ALL) // telling this class is has a relationship with below class
	@JoinColumn(name = "student_id") // specific column relationship
	private N03_Student student;

	public N03_Student getStudent() {
		return student;
	}

	public void setStudent(N03_Student student) {
		this.student = student;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_mobile_number() {
		return student_mobile_number;
	}

	public void setStudent_mobile_number(String student_mobile_number) {
		this.student_mobile_number = student_mobile_number;
	}
}
