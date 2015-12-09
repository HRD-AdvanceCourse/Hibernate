package com.hibernate.chapter4.InheritanceMapping.Joined;

import javax.persistence.Entity;

@Entity
public class ModuleChpt4 extends ProjectChpt4 {
	private String ModuleName;

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

}
