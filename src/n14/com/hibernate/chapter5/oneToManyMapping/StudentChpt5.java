package n14.com.hibernate.chapter5.oneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class StudentChpt5 {
	private int studentId;
	private String studentName;
	private CollegeChpt5 college;

	@Id
	@GeneratedValue
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	/*
	 * <pre>
	 * 
	 * Step2: Add @ManyToOne to getter of college
	 * 
	 *
	 *  </pre>
	 */
	@ManyToOne()
	@JoinColumn(name="college_id")
	public CollegeChpt5 getCollege() {
		return college;
	}

	public void setCollege(CollegeChpt5 college) {
		this.college = college;
	}
}
