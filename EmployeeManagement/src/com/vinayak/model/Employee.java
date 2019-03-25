package com.vinayak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Employee {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int empId;

@Column
private String empName;

@Column
private String empDept;

@Column
private String empMentor;

@Column
private int empSalary;

public String getEmpMentor() {
	return empMentor;
}
public void setEmpMentor(String empMentor) {
	
	System.out.println("Employee Model");
	this.empMentor = empMentor;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDept() {
	return empDept;
}
public void setEmpDept(String empDept) {
	this.empDept = empDept;
}
}
