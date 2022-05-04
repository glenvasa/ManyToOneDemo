package com.perscholas.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	private String salary;
	private String Teachername;

	@ManyToOne
	private Department department; // Hibernate by default uses department_did as column name to store foreign key.

	public Teacher(int tid, String salary, String teachername) {
		super();
		this.tid = tid;
		this.salary = salary;
		Teachername = teachername;
	}

	public Teacher() {
	}

	public Department getDep() {
		return department;
	}

	public void setDep(Department department) {
		this.department = department;
	}

	public int getTit() {
		return tid;
	}

	public void setTit(int tit) {
		this.tid = tid;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getTeachername() {
		return Teachername;
	}

	public void setTeachername(String teachername) {
		Teachername = teachername;
	}
}
