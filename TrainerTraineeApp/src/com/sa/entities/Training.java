package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Training {
	
	//public static final String getNumberofTrainees = 4;
	private long id;
	private String name;
	private Trainer trianer;
	private List<Trainee>trinees=new ArrayList<Trainee>();
	
	private Course course;

	public Training(long id, String name, Trainer trianer, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.trianer = trianer;
		//this.trinees = trinees;
		//this.course = course;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Trainer getTrianer() {
		return trianer;
	}

	public void setTrianer(Trainer trianer) {
		this.trianer = trianer;
	}

	public List<Trainee> getTrinees() {
		return trinees;
	}

	public void setTrinees(List<Trainee> trinees) {
		this.trinees = trinees;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public int getNumberofTrainees(List<Trainee> trainees) {
		return trainees.size();
	}
	
	public String getTrainingOrgName(Trainer trainer) {
		return trainer.getOrg().getName();	
	}
	
	public int getTrainingDurationInHrs() {
		List<Module> modules = new ArrayList<Module>();
		modules = getCourse().getModules();
		int durationInHrs = 0;
		for(Module module : modules) {
			for(Unit unit : module.getUnits()) {
				durationInHrs += unit.getDurationInHrs();	
			}
		}
		return durationInHrs;
	}
	
}



		
		
		
	


