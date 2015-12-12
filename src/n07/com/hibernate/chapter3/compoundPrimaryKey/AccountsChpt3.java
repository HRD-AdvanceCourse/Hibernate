package n07.com.hibernate.chapter3.compoundPrimaryKey;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class AccountsChpt3 {

	/* Step 1: Before, to create a compound key we need to move that keys to new
		class(compoundkey class) */
	// private int userId;
	// private int accountId;
	// private int accountBalance;

	private int accountBalance;
	
	// Step 3 : create Compound Key class object
	@Id // add @Id because this compound key is going to be primary key
	private CompoundKeyChpt3 compoundKeyChpt3;

	
	// step 5 generate getter and setter
	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public CompoundKeyChpt3 getCompoundKeyChpt3() {
		return compoundKeyChpt3;
	}

	public void setCompoundKeyChpt3(CompoundKeyChpt3 compoundKeyChpt3) {
		this.compoundKeyChpt3 = compoundKeyChpt3;
	}
	

	
	
	
	
}
