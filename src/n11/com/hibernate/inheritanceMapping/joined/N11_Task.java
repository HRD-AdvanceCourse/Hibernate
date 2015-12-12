package n11.com.hibernate.inheritanceMapping.joined;

import javax.persistence.Entity;

@Entity
public class N11_Task extends N11_Module {
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
