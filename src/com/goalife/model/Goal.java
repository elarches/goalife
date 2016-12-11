package com.goalife.model;

public class Goal {
  private String title;
	private String owner_fname;
	private String owner_lname;
	private String description;
	private String deadline;
	private double progress;
	private int cheers;
	private int boos;
	private int regoals;
	
	public Goal(String title, String owner_fname, String owner_lname, String description, String deadline,
			double progress, int cheers, int boos, int regoals) {
		this.title = title;
		this.owner_fname = owner_fname;
		this.owner_lname = owner_lname;
		this.description = description;
		this.deadline = deadline;
		this.progress = progress;
		this.cheers = cheers;
		this.boos = boos;
		this.regoals = regoals;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getOwnerFname() {
		return owner_fname;
	}
	
	public String getOwnerLname() {
		return owner_lname;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDeadline() {
		return deadline;
	}
	
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	public double getProgress() {
		return progress;
	}
	
	public void setProgress(double progress) {
		this.progress = progress;
	}
	
	public int getCheers() {
		return cheers;
	}
	
	public void setCheers(int cheers) {
		this.cheers = cheers;
	}
	
	public int getBoos() {
		return boos;
	}
	
	public void setBoos(int boos) {
		this.boos = boos;
	}
	
	public int getRegoals() {
		return regoals;
	}
	
	public void setRegoals(int regoals) {
		this.regoals = regoals;
	}
	
}
