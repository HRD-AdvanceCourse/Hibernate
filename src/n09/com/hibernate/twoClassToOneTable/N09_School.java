package n09.com.hibernate.twoClassToOneTable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class N09_School {
	
	@Id
	@GeneratedValue
	private int schoolId;
	private String schoolName;

	
	private N09_SchoolDetail schoolDetail;
	
	// step 1: embed schooldetail in school class, step2 go to school detail class add @Embeddable above class
	@Embedded 
	public N09_SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(N09_SchoolDetail schoolDetail) {
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
