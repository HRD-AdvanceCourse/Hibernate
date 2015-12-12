package n08.com.hibernate.oneClassToTwoTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="N08_Customer")
@SecondaryTable(name="N08_Customer_Detail") //create another table with this class, so it will create Customer and CustomerDetail table
public class N08_Customer {
	
	private int customerId;
	private String customerName;
	

	private String customerAddress;
	private int creditScroe;
	private int rewardPoints;

	@Id
	@GeneratedValue
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	//Must tell above getter method
	@Column(table="N08_Customer_Detail")
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Column(table="N08_Customer_Detail")
	public int getCreditScroe() {
		return creditScroe;
	}

	public void setCreditScroe(int creditScroe) {
		this.creditScroe = creditScroe;
	}

	@Column(table="N08_Customer_Detail")
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
