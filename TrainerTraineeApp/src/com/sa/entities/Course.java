package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private long id;
	private String name;
	private List<Training>trinings=new ArrayList<Training>();
	
	
	public Course(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private List<Module>modules=new ArrayList<Module>();
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
	public List<Training> getTrinings() {
		return trinings;
	}
	public void setTrinings(List<Training> trinings) {
		this.trinings = trinings;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
	
	
	

}
