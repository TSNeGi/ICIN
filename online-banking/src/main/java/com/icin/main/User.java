package com.icin.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	private String userId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "userMail")
	private String userMail;

	@Column(name = "userContact")
	private String userContact;

	@Column(name = "userPassword")
	private String userPassword;

	@Column(name = "userStatus")
	private String userStatus;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMail=" + userMail + ", userContact="
				+ userContact + ", userPassword=" + userPassword + ", userStatus=" + userStatus + "]";
	}

	public User(String userId, String userName, String userMail, String userContact, String userPassword,
			String userStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.userContact = userContact;
		this.userPassword = userPassword;
		this.userStatus = userStatus;
	}
	
	
	

}
