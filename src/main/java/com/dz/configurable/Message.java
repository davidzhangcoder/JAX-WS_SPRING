package com.dz.configurable;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity       
@Table(name = "P_MESSAGE")
public class Message extends ConfigurableBase
{
	
	private static final long serialVersionUID = -6952337114848595438L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	
	@Column(name = "MESSAGE")
	private String message;	
	
	
	@OneToOne(fetch=javax.persistence.FetchType.LAZY)
	@JoinColumn(name="USER_ID")
	private User user;

	@Column(name = "CREATED_BY")
	private Integer createdBy;
	
	@Column(name = "CREATED_TIME")
	private Calendar createdTime;
	
	@Column(name = "UPDATED_BY")
	private Integer updatedBy;
	
	@Column(name = "UPDATED_TIME")
	private Calendar updatedTime;

	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}


	
}
