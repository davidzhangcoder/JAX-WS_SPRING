package com.dz.configurable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity       
@Table(name = "G_GROUP_USER")
public class GroupUser extends ConfigurableBase
{
	
	private static final long serialVersionUID = -2752842309938493345L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID;
	
	@OneToOne(fetch=javax.persistence.FetchType.LAZY)
	@JoinColumn(name="GROUP_ID")
	private Group group;

	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	@org.hibernate.annotations.BatchSize(size = 25)
	@JoinTable(
			name="G_GROUP_USER_MESSAGE",
			joinColumns={@JoinColumn(name="GROUP_USER_ID")},
			inverseJoinColumns=@JoinColumn(name="MESSAGE_ID")
			)
	private List<Message> users = new ArrayList<Message>();

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public List<Message> getUsers() {
		return users;
	}

	public void setUsers(List<Message> users) {
		this.users = users;
	}


}
