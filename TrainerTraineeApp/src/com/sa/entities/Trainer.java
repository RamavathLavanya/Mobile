package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
	private long Id;
	private String name;
	private Organization org;
	private List<Trainee>trainees=new ArrayList<Trainee>();
	private List<Training>trainigs=new ArrayList<Training>();
	
	public Trainer(long id, String name, Organization org) {
		super();
		this.Id = id;
		this.name = name;
		this.org = org;


	}
	public Trainer(int i, String string, Trainer trainer) {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Organization getOrg() {
		return org;
	}
	public void setOrg(Organization org) {
		this.org = org;
	}
	public List<Trainee> getTrainees() {
		return trainees;
	}
	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}
	public List<Training> getTrainigs() {
		return trainigs;
	}
	public void setTrainigs(List<Training> trainigs) {
		this.trainigs = trainigs;
	}
	
	
	
	

}
