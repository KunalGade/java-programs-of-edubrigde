package com.one2onebidirection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {
	
	@Id
	private int d_id;
	private String dname;
	private String d_add;
	
	@OneToOne(mappedBy = "dpt",cascade = CascadeType.ALL)
     private Employee emp;

	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getD_add() {
		return d_add;
	}

	public void setD_add(String d_add) {
		this.d_add = d_add;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
}
