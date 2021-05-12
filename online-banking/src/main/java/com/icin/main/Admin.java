package com.icin.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adimId;
	private String adminUername;
	private String adminPassword;
	public int getAdimId() {
		return adimId;
	}
	public void setAdimId(int adimId) {
		this.adimId = adimId;
	}
	public String getAdminUername() {
		return adminUername;
	}
	public void setAdminUername(String adminUername) {
		this.adminUername = adminUername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public Admin() {
		super();
	}
	
	public Admin(String adminUername, String adminPassword) {
		super();
		this.adminUername = adminUername;
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Admin [adminPassword=" + adminPassword + "]";
	}
	

	
}
