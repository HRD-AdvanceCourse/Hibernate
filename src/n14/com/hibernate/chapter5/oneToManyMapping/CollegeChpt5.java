package n14.com.hibernate.chapter5.oneToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CollegeChpt5 {
	private int collegeId;
	private String collegeName;
	private List<StudentChpt5> student;

	@Id
	@GeneratedValue
	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int CollegeId) {
		this.collegeId = CollegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/*
	 * <pre>
	 * 
	 * Step1: Add @OneToMany to getter of student
	 * 
	 * targetEntity=target class is the class that want to have relationship
	 * with this class
	 * 
	 * mappedBy="value", value is the College object in target class
	 * 
	 * fetch=FetchType.LAZY(default of oneToMany is LAZY) if college have 1000
	 * student it will load all student by default to memory each time will call
	 * that record
	 * 
	 * fetch=FetchType.EAGER is whenever we load the college object we want the related student object also be loaded
	 * 
	 *  </pre>
	 */
	@OneToMany(targetEntity = StudentChpt5.class, mappedBy = "college", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	public List<StudentChpt5> getStudent() {
		return student;
	}

	public void setStudent(List<StudentChpt5> student) {
		this.student = student;
	}
}
