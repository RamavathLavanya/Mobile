package com.sa.entities;

import java.util.ArrayList;
import java.util.List;

public class Unit {
	private int durationInHrs;
	
	public Unit(int durationInHrs) {
		super();
		this.durationInHrs = durationInHrs;
	}
	private List<Topic>topics=new ArrayList<Topic>();
	public int getDurationInHrs() {
		return durationInHrs;
	}
	public void setDurationInHrs(int durationInHrs) {
		this.durationInHrs = durationInHrs;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	
	
	

}
