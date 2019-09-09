package com.capg;

import java.time.LocalDate;
import java.util.Map;

public class ScrumDetails {

	private Application application;
	private Map<Application,TeamMembers> teamMembers;
	private Map<Application,String> actionItem;
	private Map<Application,String> update;
	private LocalDate date;
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public Map<Application,TeamMembers> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(Map<Application,TeamMembers> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public Map<Application, String> getActionItem() {
		return actionItem;
	}
	public void setActionItem(Map<Application, String> actionItem) {
		this.actionItem = actionItem;
	}
	public Map<Application, String> getUpdate() {
		return update;
	}
	public void setUpdate(Map<Application, String> update) {
		this.update = update;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	public ScrumDetails(Application application, Map<Application, TeamMembers> teamMembers, Map<Application, String> actionItem,
			Map<Application, String> update, LocalDate date) {
		super();
		this.application = application;
		this.teamMembers = teamMembers;
		this.actionItem = actionItem;
		this.update = update;
		this.date = date;
	}
	@Override
	public String toString() {
		return "ScrumDetails application=" + application + ", teamMembers=" + teamMembers + ", actionItem="
				+ actionItem + ", update=" + update + ", date=" + date + "]";
	}
	
	
	
}
