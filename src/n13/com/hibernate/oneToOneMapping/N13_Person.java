package n13.com.hibernate.oneToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class N13_Person {
	/*
	 * <pre>
	 * 
	 * UBi-directional: when we load person object the related personDetail
	 * object will also be loaded
	 * 
	 * Bi-directional: is reverse from UBi-directional, when we load
	 * personDetail object then we want to load person object also be loaded
	 * 
	 * </pre>
	 */

	/*
	 * <pre>
	 * 
	 * Step1: To have a relationship between class , make sure in that class
	 * have an instance of another class
	 * 
	 * </pre>
	 */

	private int personId;
	private String personName;

	// Step 2: Create an instance of Person Detail Class
	private N13_PersonDetail personDetail;

	/*
	 * <pre>
	 * 
	 * Step 3: add @OneToOne to an instance, this will create an one to one
	 * relationship between Person Table and PersonDetail Table
	 * 
	 * cascade = CascadeType
	 * 
	 * -All: =Refresh and Remove
	 * 
	 * -Refresh(Update): Refresh parent record then child record also refresh
	 * 
	 * -Remove: delete parent then child record also delete
	 * 
	 * 
	 * 
	 * fetch = FetchType
	 * 
	 * -EAGER(default of 1to1): Whenever person record is load, the personDetail
	 * also load to personDetail object
	 * 
	 * 
	 * </pre>
	 */
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "personDetail_FK")
	// give a name to join column, default name will be named by hibernate
	public N13_PersonDetail getPersonDetail() {
		return personDetail;
	}

	public void setPersonDetail(N13_PersonDetail personDetail) {
		this.personDetail = personDetail;
	}

	@Id
	@GeneratedValue
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
