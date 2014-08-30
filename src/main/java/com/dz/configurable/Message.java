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
@Table(name = "M_MESSAGE")
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

	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}


	
}
