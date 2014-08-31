package com.dz.configurable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity       
@Table(name = "D_MESSAGE")
public class Group extends ConfigurableBase
{
	
	private static final long serialVersionUID = -7747056983505552408L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;

	@Column(name = "NAME")
	private String name;	

	
	@Column(name = "CREATED_BY")
	private Integer createdBy;
	
	@Column(name = "CREATED_TIME")
	private Calendar createdTime;
	
	@Column(name = "UPDATED_BY")
	private Integer updatedBy;
	
	@Column(name = "UPDATED_TIME")
	private Calendar updatedTime;
	
	@javax.persistence.OneToMany(targetEntity = GroupUser.class, 
			fetch = javax.persistence.FetchType.LAZY, 
			mappedBy = "group")
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.ALL })
	@org.hibernate.annotations.BatchSize(size = 10)
	@org.hibernate.annotations.NotFound(action = org.hibernate.annotations.NotFoundAction.IGNORE)
	private List<GroupUser> groupUsers = new ArrayList<GroupUser>();

	public List<GroupUser> getGroupUsers() {
		return groupUsers;
	}

	public void setGroupUsers(List<GroupUser> groupUsers) {
		this.groupUsers = groupUsers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
