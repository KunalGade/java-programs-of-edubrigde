package com.many2manymapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	
	@Id
	private int eid;
	private String ename;
	
	@ManyToMany
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public<List>Project getPro()
	{
		return Pro;
	}
	

	

}
