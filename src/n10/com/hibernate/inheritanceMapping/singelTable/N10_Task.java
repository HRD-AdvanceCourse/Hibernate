package n10.com.hibernate.inheritanceMapping.singelTable;

import javax.persistence.Entity;

@Entity
public class N10_Task extends N10_Module {
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
