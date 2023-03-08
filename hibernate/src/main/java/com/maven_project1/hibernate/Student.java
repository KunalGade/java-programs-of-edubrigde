package com.maven_project1.hibernate;

import javax.annotation.Generated;

@Entity
public class Student {
	@id
	@Generated

	private int sid;
	private String sname;
	private String sdegree;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdegree() {
		return sdegree;
	}
	public void setSdegree(String sdegree) {
		this.sdegree = sdegree;
	}
	public Student(String sname, String sdegree) {
		super();
		this.sname = sname;
		this.sdegree = sdegree;
	}
	
	
	
	
}
