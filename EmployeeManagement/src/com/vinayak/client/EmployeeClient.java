package com.vinayak.client;

import com.vinayak.dao.EmployeeDao;
import com.vinayak.dao.EmployeeDaoImplementataion;
import com.vinayak.model.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		//emp.setEmpId(1);
		emp.setEmpName("srikanth");
		emp.setEmpDept("java");
		emp.setEmpMentor("koti reddy");
		emp.setEmpSalary(10000);
		
		System.out.println("EmployeeClient");
		
		EmployeeDao empd = new EmployeeDaoImplementataion();
		empd.insertEmployee(emp);

	}

}
