package com.capg;

public class TeamMembers {

	private String memName;
	private String email;
	private boolean tl=false;
	private Application application;

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTl() {
		return tl;
	}

	public void setTl(boolean tl) {
		this.tl = tl;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public TeamMembers(String memName, String email, boolean tl, Application application) {
		super();
		this.memName = memName;
		this.email = email;
		this.tl = tl;
		this.application = application;
	}

	@Override
	public String toString() {
		return "TeamMembers name=" + memName + ", email=" + email + ", tl=" + tl + application ;
	}

}
