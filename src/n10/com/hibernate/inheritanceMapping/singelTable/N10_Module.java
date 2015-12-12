package n10.com.hibernate.inheritanceMapping.singelTable;

import javax.persistence.Entity;

@Entity
public class N10_Module extends N10_Project {
	private String ModuleName;

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

}
