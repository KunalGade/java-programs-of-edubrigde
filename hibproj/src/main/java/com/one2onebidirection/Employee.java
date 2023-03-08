package com.one2onebidirection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private int e_id;
	private String ename;
	
	@OneToOne
	@JoinColumn(name="did")
    private Department dpt;

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department getDpt() {
		return dpt;
	}

	public void setDpt(Department dpt) {
		this.dpt = dpt;
	}
	
	
}
