package com.dz.configurable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity       
@Table(name = "U_USER")
public class User extends ConfigurableBase
{

	private static final long serialVersionUID = -2174379412821116975L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	
	@Column(name = "FIRST_NAME")
	private String firstName;	
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "CREATED_BY")
	private Integer createdBy;
	
	@Column(name = "CREATED_TIME")
	private Calendar createdTime;
	
	@Column(name = "UPDATED_BY")
	private Integer updatedBy;
	
	@Column(name = "UPDATED_TIME")
	private Calendar updatedTime;
	
	@javax.persistence.OneToMany(targetEntity = Message.class, 
			fetch = javax.persistence.FetchType.LAZY, 
			mappedBy = "user")
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.ALL })
	@org.hibernate.annotations.BatchSize(size = 10)
	@org.hibernate.annotations.NotFound(action = org.hibernate.annotations.NotFoundAction.IGNORE)
	private List<Message> messages = new ArrayList<Message>();

	
	
	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Calendar getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Calendar createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Calendar getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Calendar updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
	
	
}
