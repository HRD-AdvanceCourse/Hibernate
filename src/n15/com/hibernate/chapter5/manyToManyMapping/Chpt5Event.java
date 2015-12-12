package n15.com.hibernate.chapter5.manyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Chpt5Event {
	private int eventId;
	private String eventName;
	private List<Chpt5Delegate> delegates = new ArrayList<Chpt5Delegate>();

	@Id
	@GeneratedValue
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/*
	 * <pre>
	 * 
	 * Step1: Add @ManyToMany
	 * 
	 * Step3: Add @JoinTable, name can be any name
	 * 
	 * Step4: define column in joinTable:
	 * 
	 * -joinColumns is columns in LEFT table that we take to joinTable, in this
	 * example we take only one column. but we can put as many we want if we
	 * need that column
	 * 
	 * -inverseJoinColumns is columns in RIGHT table that we take to joinTable,
	 * in this example we take only one column. but we can put as many we want
	 * if we need that column
	 * 
	 * 
	 * </pre>
	 */

	@ManyToMany
	@JoinTable(name = "JOIN_DELEGATE_EVENT", joinColumns = { @JoinColumn(name = "eventId") }, inverseJoinColumns = { @JoinColumn(name = "delegateId") })
	public List<Chpt5Delegate> getDelegates() {
		return delegates;
	}

	public void setDelegates(List<Chpt5Delegate> delegates) {
		this.delegates = delegates;
	}
}
