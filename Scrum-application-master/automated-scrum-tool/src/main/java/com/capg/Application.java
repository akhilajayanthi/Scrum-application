package com.capg;

public class Application {

	private String appName;
	private String details;
	private String type;
	private Status status;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Application() {

	}

	@Override
	public String toString() {
		return "Application Name=" + appName + ", details=" + details + ", type=" + type + ", status=" + status;
	}

	public Application(String appName, String details, String type, Status status) {

		this.appName = appName;
		this.details = details;
		this.type = type;
		this.status = status;
	}

}
