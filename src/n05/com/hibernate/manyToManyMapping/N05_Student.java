package n05.com.hibernate.manyToManyMapping;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "N05_Student")
public class N05_Student {

	@Id
	@GeneratedValue
	private int student_id;

	private String student_name;

	// Step 1: Add a collection of Set of studentCertification class
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<N05_StudentCertification> studentCertification=new HashSet<N05_StudentCertification>();
	
	public Set<N05_StudentCertification> getStudentCertification() {
		return studentCertification;
	}

	public void setStudentCertification(Set<N05_StudentCertification> studentCertification) {
		this.studentCertification = studentCertification;
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
