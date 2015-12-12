package n07.com.hibernate.compoundPrimaryKey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class N07_Accounts {

	/* Step 1: Before, to create a compound key we need to move that keys to new
		class(compoundkey class) */
	// private int userId;
	// private int accountId;
	// private int accountBalance;

	private int accountBalance;
	
	// Step 3 : create Compound Key class object
	@Id // add @Id because this compound key is going to be primary key
	private N07_CompoundKey compoundKeyChpt3;

	
	// step 5 generate getter and setter
	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public N07_CompoundKey getCompoundKeyChpt3() {
		return compoundKeyChpt3;
	}

	public void setCompoundKeyChpt3(N07_CompoundKey compoundKeyChpt3) {
		this.compoundKeyChpt3 = compoundKeyChpt3;
	}
	

	
	
	
	
}
