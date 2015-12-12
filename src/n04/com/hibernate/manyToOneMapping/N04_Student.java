package n04.com.hibernate.manyToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "N04_Student")
public class N04_Student {

	@Id
	@GeneratedValue
	private int student_id;

	private String student_name;

	// Step 1 : Just mention child object in parent class with getter setter 
	// Here is Many To One
	@ManyToOne(cascade = CascadeType.ALL)
	private N04_StudentAddress studentAddress;

	public N04_StudentAddress getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(N04_StudentAddress studentAddress) {
		this.studentAddress = studentAddress;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

}
