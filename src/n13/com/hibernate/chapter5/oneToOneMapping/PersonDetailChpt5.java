package n13.com.hibernate.chapter5.oneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonDetailChpt5 {
	private int personDetailId;
	private String zipCode;
	private String job;
	private double income;

	/*
	 * <pre>
	 * 
	 * Step 4-Bi-directional:
	 * 
	 * first: Create Person object in PersonDetail class
	 * 
	 * second: Add @OneToOne(mappedBy="personDetail"), mappedBy value(personDetail) must be the
	 * same name of object in Person Class
	 * 
	 * </pre>
	 */
	private PersonChpt5 person;

	@OneToOne(mappedBy = "personDetail", cascade=CascadeType.ALL)
	public PersonChpt5 getPerson() {
		return person;
	}

	public void setPerson(PersonChpt5 person) {
		this.person = person;
	}

	@Id
	@GeneratedValue
	@Column(name = "detailId_PK")
	public int getPersonDetailId() {
		return personDetailId;
	}

	public void setPersonDetailId(int personDetailId) {
		this.personDetailId = personDetailId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}
}
