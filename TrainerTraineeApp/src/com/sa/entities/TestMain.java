package com.sa.entities;

import java.util.List;
import java.util.ArrayList;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Organization org=new Organization("NewtonSchool");
		
		//adding org to treiner
		//Adding org to trainer
				Trainer trainer = new Trainer (1,"Bala" , org);
				
				//adding trainer to trainees
				Trainee t1 = new Trainee(1, "Ajay", trainer);
				Trainee t2 = new Trainee(2, "Sandhya", trainer);
				Trainee t3 = new Trainee(3, "Sujay", trainer);
				Trainee t4 = new Trainee(4, "Sharan", trainer);
				
				//Adding trainer to training
				Training tr1 = new Training(1, "Java Training", trainer,null);
				
				//adding each trainee to list
				List<Trainee> trainees = new ArrayList<Trainee>();
				trainees.add(t1);
				trainees.add(t2);
				trainees.add(t3);
				trainees.add(t4);
				
				//adding trainees to training
				tr1.setTrinees(trainees);
				
				Course c1 = new Course(1, "Java Program");
				
				//adding course to training
				tr1.setCourse(c1);
				
				Module m1 = new Module(1, "OO Programming");
				Module m2 = new Module(2, "Collections");
				
				List<Module> modules = new ArrayList<Module>();
				modules.add(m1);
				modules.add(m2);
				
				//adding modules to course
				c1.setModules(modules);
				
				Unit u1 = new Unit(25);
				Unit u2 = new Unit(35);
				
				List<Unit> units = new ArrayList<Unit>();
				units.add(u1);
				units.add(u2);
				
				//Adding units to modules
				m1.setUnits(units);//60
				m2.setUnits(units);//60
				
				Topic to1 = new Topic("OO relationships");
				Topic to2 = new Topic("List");
				Topic to3 = new Topic("Set");
				
				List<Topic> topics1 = new ArrayList<Topic>();
				topics1.add(to1);
				
				List<Topic> topics2 = new ArrayList<Topic>();
				topics2.add(to2);
				topics2.add(to3);
				
				//Adding topics to units
				u1.setTopics(topics1);
				u2.setTopics(topics2);
				
				System.out.println("Number of trainees : " + tr1.getNumberofTrainees(trainees));
				System.out.println("Training Org Name : " + tr1.getTrainingOrgName(trainer));
				System.out.println("Training duration in Hrs : " + tr1.getTrainingDurationInHrs());

			}

		}
