package n11.com.hibernate.chapter4.InheritanceMapping.Joined;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//This will create 3 table Project, Module, and Task and link relationship by primary key from parent table to child table(one to many)
@Inheritance(strategy=InheritanceType.JOINED)
public class ProjectChpt4 {
	private int projectId;
	private String projectName;

	@Id
	@GeneratedValue
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
