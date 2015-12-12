package n11.com.hibernate.chapter4.InheritanceMapping.Joined;

import javax.persistence.Entity;

@Entity
public class TaskChpt4 extends ModuleChpt4 {
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
