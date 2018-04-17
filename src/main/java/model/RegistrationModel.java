package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="UserRegistration")
public class RegistrationModel {
	
	@Id
	@Column(name="UserID",unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userID;
	
	@Column(name="Email")
	private String email;
	
	 @Column(name = "UserPassword")
	private String userPassword;
	
	 @Column(name = "FirstName")
	private String firstName;
	
	 @Column(name = "LastName")
	private String lastName;
	
	 @Column(name = "IsActive")
	private boolean isActive;
	
	 @Column(name = "CreatedDate")
	private Date createdDate;
	
	 @Column(name = "ModifiedDate")
	private Date modifiedDate;
	
	
	public RegistrationModel() {
		
	}

	//Constructor
	public RegistrationModel(int userID, String name, String email, String userPassword, String firstName,
	 
			String lastName, boolean isActive, Date createdDate, Date modifiedDate) {
		this.userID = userID;
		this.email = email;
		this.userPassword = userPassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isActive = isActive;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}
	
	public int getuserID() {
		return userID;
	}
	public void setuserID(int id) {
		this.userID = id;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String emailID) {
		this.email = emailID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String password) {
		this.userPassword = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
