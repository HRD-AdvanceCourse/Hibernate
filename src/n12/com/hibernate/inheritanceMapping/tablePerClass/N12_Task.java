package n12.com.hibernate.inheritanceMapping.tablePerClass;

import javax.persistence.Entity;

@Entity
public class N12_Task extends N12_Module {
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
