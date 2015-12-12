package n12.com.hibernate.chapter4.InheritanceMapping.TablePerClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
// This will create 3 table Project, Module, and Task
/*
 * table project will have field: -projectId, -projectName
 */
/*
 * table module will have field: -projectId, -projectName, -moduleName
 */
/*
 * table task will have field: -projectId, -projectName, -moduleName, -taskName
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ProjectChpt4TPC {
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
