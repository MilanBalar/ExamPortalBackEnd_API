package com.boot.server.exam.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TblUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private boolean isActive=true;

	//relation
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "tblUser")
	@JsonIgnore
	private Set<TblUsersRole> tblUsersRoles=new HashSet<>();



	public Set<TblUsersRole> getTblUsersRoles() {
		return tblUsersRoles;
	}
	public void setTblUsersRoles(Set<TblUsersRole> tblUsersRoles) {
		this.tblUsersRoles = tblUsersRoles;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public TblUser(Long userId, String userName, String password, String firstName, String lastName, String email,
			String phone, boolean isActive) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.isActive = isActive;
	}
   public TblUser() {
		super();
	}




}