package com.vinayak.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vinayak.util.EmployeeUtil;
import com.vinayak.model.Employee;

public class EmployeeDaoImplementataion implements EmployeeDao {

	@Override
	public int insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		Session session = null;
		session = EmployeeUtil.getSession();
		Transaction trnx = session.beginTransaction();
		
		int primary = (int) session.save(e);
		trnx.commit();
		//System.out.println("Employee Dao Impl");
		return primary;
	 
	}
	public List<Employee> displayEmployee(Employee e) {
		// TODO Auto-generated method stub
		Session session = null;
		session = EmployeeUtil.getSession();
		Transaction trnx = session.beginTransaction();
		List<Employee> list=new ArrayList();
		 Query q = (Query)session.createQuery("from Employee");
		 list=q.list();
		trnx.commit();
		 
		return list;
	}
	@Override
	public int updateEmployee(Employee e) {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteEmployee(Employee e) {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int selectEmployee(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
