package n12.com.hibernate.chapter4.InheritanceMapping.TablePerClass;

import javax.persistence.Entity;

@Entity
public class TaskChpt4TPC extends ModuleChpt4TPC {
	private String taskName;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
}
