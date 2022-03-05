package com.pragim.manytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "proj_seq")
	@SequenceGenerator(name = "proj_seq",sequenceName ="proj_seq",allocationSize = 1,initialValue = 1)

	private int pId;

	@Column(length = 30)
	private String projName;

	private int members;

	@ManyToMany(cascade = CascadeType.ALL,targetEntity = Project.class)
	 @JoinTable(
		        name = "Employee_Project", 
		        joinColumns = { @JoinColumn(name = "project_id") }, 
		        inverseJoinColumns = { @JoinColumn(name = "employee_id") })
	private Set<Employee> empList;

	

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public Set<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(Set<Employee> empList) {
		this.empList = empList;
	}

}
