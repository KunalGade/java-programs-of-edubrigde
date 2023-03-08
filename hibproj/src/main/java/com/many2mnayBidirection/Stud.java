package com.many2mnayBidirection;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;



@Entity
@SequenceGenerator(name ="studentjen",sequenceName= "s1",initialValue =10)

public class Stud {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "studentjen" )
	private int id;
	private String name;
	@ManyToMany
	private List<Course> courses;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
