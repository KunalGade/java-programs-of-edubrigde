package com.many2mnayBidirection;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Course {
  @Id
  @GeneratedValue()
  private int course_id;
  private String course_name;
  
  @ManyToMany(mappedBy = "courses")
  private List<Stud> studs;
  
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public List<Stud> getStuds() {
	return studs;
}
public void setStuds(List<Stud> studs) {
	this.studs = studs;
}
  
  
  
  
  
}
