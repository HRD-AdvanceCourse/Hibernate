package n14.com.hibernate.oneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class N14_Student {
	private int studentId;
	private String studentName;
	private N14_College college;

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
	public N14_College getCollege() {
		return college;
	}

	public void setCollege(N14_College college) {
		this.college = college;
	}
}
