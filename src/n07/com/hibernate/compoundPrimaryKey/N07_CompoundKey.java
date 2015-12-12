package n07.com.hibernate.compoundPrimaryKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

//Step 4: to Create a compond key this class must implement Serializable interface
// then add  @Embeddable > Generate getter and setter
@Embeddable
public class N07_CompoundKey implements Serializable {

	// Step 2 this is compound key

	private int userId;
	private int accountId;
	
	//step 5
	public N07_CompoundKey(int userId, int accountId) {
		this.userId = userId;
		this.accountId = accountId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

}
