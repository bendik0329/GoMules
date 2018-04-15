package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Blah")
public class RegistrationModel {
	
	@Id
	private int id;
	private String name;
	private String emailID;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	 @Override
	    public String toString() {
	        return "RegistrationModel [name=" + name + ", emailID=" + emailID
	                + ", password=" + password + "]";
	    }

}
