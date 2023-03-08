package com.maven_project2.hibproj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries(
		{
			@NamedQuery(
				name="find student by name",
				query="from Student s where s.sname =:sname"
				)
		}

)
@Entity
public class Student {
	
		@Id
		@GeneratedValue
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


