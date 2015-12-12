package n06.com.hibernate.startup;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="N06_EmployeeInfo")
public class N06_Employee {
	
	@Id @Column(name ="EmployeeID") 	
	//Create a table for storing pkvalue by mapping empid column
	//-name=mapping to generator
	//-table=tablename
	//-pkColumnName=column name in tablename
	//-pkColumnValue=store value of empid column
	//-allocationSize=next size
	@TableGenerator(name="empid", table="N06_emppktb", pkColumnName="empkey", pkColumnValue="empvalue", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="empid")
	private int empId;
	private String empName;

	@Transient //This column will not save to table
	private String empPassword;
	
	@Column(nullable=false) //not null
	private String empEmailAddress;
	
	@Basic //Default annotation
	private boolean isPermanent;
	
	@Temporal(TemporalType.DATE) //Use only Date
	private Calendar empJoinDate;
	
	@Temporal(TemporalType.TIMESTAMP) //Use only time
	private Date empLoginTime;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getEmpEmailAddress() {
		return empEmailAddress;
	}
	public void setEmpEmailAddress(String empEmailAddress) {
		this.empEmailAddress = empEmailAddress;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	public Calendar getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(Calendar empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	public Date getEmpLoginTime() {
		return empLoginTime;
	}
	public void setEmpLoginTime(Date empLoginTime) {
		this.empLoginTime = empLoginTime;
	}
}
