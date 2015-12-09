package com.hibernate.chapter4.InheritanceMapping.TablePerClass;

import javax.persistence.Entity;

@Entity
public class ModuleChpt4TPC extends ProjectChpt4TPC {
	private String ModuleName;

	public String getModuleName() {
		return ModuleName;
	}

	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}

}
