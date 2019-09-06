package com.capg;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.capg")
public class App {
	@Autowired
	static ScrumDetails scrumDetails;
	@Autowired
	static Application appli;
	@Autowired
	static Team team;
	@Autowired
	static TeamMembers teamMembers;

	private static Map<Application, TeamMembers> teamList;

	public static void main(String[] args) {
		

		 appli = new Application("powerly","bdsjhfcisd","java",Status.DOCUMENTATION);
		 Application appli1 = new
		 Application("MDM","bdsjhfcisd","java",Status.SANITY);

		teamMembers = new TeamMembers("abcd", "abcd@gmail.com", true, appli);
		TeamMembers member1 = new TeamMembers("fdggs", "fdggs@gmail.com", false, appli);

		teamList = new HashMap<>();
		teamList.put(appli, teamMembers);
	    teamList.put(appli1,member1);

		Map<Application, String> actionItem = new HashMap<>();
		actionItem.put(appli, "documentation work");
		actionItem.put(appli1, "sanity testing work");

		Map<Application, String> update = new HashMap<>();
		update.put(appli, "code flow document");
		update.put(appli1, "running tests");

		LocalDate date = LocalDate.now();

		scrumDetails = new ScrumDetails(appli, teamList, actionItem, update, date);
		ScrumDetails scrumDetails1 = new ScrumDetails(appli1, teamList, actionItem,update, date);

		System.out.println("Scrum Details\n");
		System.out.format("%10s%15s%20s%20s%20s\n", "Application", "Teammember", "Action Item", "Update", "Date");

		System.out.format("%5s%15s%30s%25s%15s\n", scrumDetails.getApplication().getAppName(),
				teamList.get(appli).getMemName(), actionItem.get(appli), update.get(appli), date);
		
		 System.out.format("%5s%15s%30s%24s%17s",scrumDetails1.getApplication().getAppName(), teamList.get(appli1).getMemName(), actionItem.get(appli1), update.get(appli1), date);
		 System.out.println("end");
	
		
	}

}
