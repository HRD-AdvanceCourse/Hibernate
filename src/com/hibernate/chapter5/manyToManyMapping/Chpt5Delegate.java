package com.hibernate.chapter5.manyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Chpt5Delegate {
	private int delegateId;
	private String delegateName;
	private List<Chpt5Event> events = new ArrayList<Chpt5Event>();

	@Id
	@GeneratedValue
	public int getDelegateId() {
		return delegateId;
	}

	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}

	public String getDelegateName() {
		return delegateName;
	}

	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}

	/*
	 * <pre>
	 * 
	 * Step2: Add @ManyToMany
	 * 
	 * Step5: define column in joinTable:
	 * 
	 * -joinColumns is columns in RIGHT table that we take to joinTable, in this
	 * example we take only one column. but we can put as many we want if we
	 * need that column
	 * 
	 * -inverseJoinColumns is columns in LEFT table that we take to joinTable,
	 * in this example we take only one column. but we can put as many we want
	 * if we need that column
	 * 
	 * 
	 * </pre>
	 */

	@ManyToMany
	@JoinTable(name = "JOIN_DELEGATE_EVENT", joinColumns = { @JoinColumn(name = "delegateId") }, inverseJoinColumns = { @JoinColumn(name = "eventId") })
	public List<Chpt5Event> getEvents() {
		return events;
	}

	public void setEvents(List<Chpt5Event> events) {
		this.events = events;
	}
}
