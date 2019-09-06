package com.capg;

import java.util.List;

public class Team {

	private String technology;
	private String teamlead;
	private List<TeamMembers> teamMembers;
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getTeamlead() {
		return teamlead;
	}
	public void setTeamlead(String teamlead) {
		this.teamlead = teamlead;
	}
	public List<TeamMembers> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<TeamMembers> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
	
	
	public Team(String technology, String teamlead, List<TeamMembers> teamMembers) {
		super();
		this.technology = technology;
		this.teamlead = teamlead;
		this.teamMembers = teamMembers;
	}
	@Override
	public String toString() {
		return "Team [technology=" + technology + ", teamlead=" + teamlead + ", teamMembers=" + teamMembers + "]";
	}
	
	
}
