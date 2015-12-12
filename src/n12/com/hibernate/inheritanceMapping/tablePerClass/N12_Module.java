package n12.com.hibernate.inheritanceMapping.tablePerClass;

import javax.persistence.Entity;

@Entity
public class N12_Module extends N12_Project {
	private String ModuleName;

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

}
