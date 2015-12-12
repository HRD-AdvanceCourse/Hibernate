package n11.com.hibernate.inheritanceMapping.joined;

import javax.persistence.Entity;

@Entity
public class N11_Module extends N11_Project {
	private String ModuleName;

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

}
