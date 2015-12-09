package com.hibernate.chapter3OneClassToTwoTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="Customer_chapter3")
@SecondaryTable(name="CustomerDetail_chapter3") //create another table with this class, so it will create Customer and CustomerDetail table
public class CustomerChpt3 {
	
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
	@Column(table="CustomerDetail")
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Column(table="CustomerDetail")
	public int getCreditScroe() {
		return creditScroe;
	}

	public void setCreditScroe(int creditScroe) {
		this.creditScroe = creditScroe;
	}

	@Column(table="CustomerDetail")
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
