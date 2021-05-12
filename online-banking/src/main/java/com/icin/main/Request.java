package com.icin.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Request {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "requestId")
	private int requestId;
	
	
	@Column(name = "requestBy")
	private String requestBy;
	
	@Column(name = "requestName")
	private String requestName;
	
	@Column(name = "requestDescription")
	private String requestDescription;
	
	@Column(name = "requestStatus")
	private String requestStatus;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getRequestBy() {
		return requestBy;
	}

	public void setRequestBy(String requestBy) {
		this.requestBy = requestBy;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getRequestDescription() {
		return requestDescription;
	}

	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	@Override
	public String toString() {
		return "Request [requestId=" + requestId + ", requestBy=" + requestBy + ", requestName=" + requestName
				+ ", requestDescription=" + requestDescription + ", requestStatus=" + requestStatus + "]";
	}

	public Request(int requestId, String requestBy, String requestName, String requestDescription,
			String requestStatus) {
		super();
		this.requestId = requestId;
		this.requestBy = requestBy;
		this.requestName = requestName;
		this.requestDescription = requestDescription;
		this.requestStatus = requestStatus;
	}

	public Request() {
		super();
		
	}
	
	
	
	
	
	
}
	