package com.vinayak.dao;

import java.util.List;

import com.vinayak.model.Employee;

public interface EmployeeDao {
public int insertEmployee(Employee e);
public int updateEmployee(Employee e);
public int deleteEmployee(Employee e);
public int selectEmployee(Employee e);
public List displayEmployee(Employee e);
}
