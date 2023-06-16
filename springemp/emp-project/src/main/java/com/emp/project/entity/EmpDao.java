package com.emp.project.entity;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.emp.project.model.Employee;

@Service
public class EmpDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createDao(Employee employee)
	{
		this.hibernateTemplate.saveOrUpdate(employee);
	}
	
	public List<Employee> getAllEmp()
	{
		List<Employee> employee = this.hibernateTemplate.loadAll(Employee.class);
		return employee;
	}
	
	@Transactional
	public void deleteDao(int pid)
	{
		Employee e= this.hibernateTemplate.get(Employee.class, pid);
		this.hibernateTemplate.delete(e);
	}
	
	public Employee getEmpById(int pid)
	{
		Employee employee = this.hibernateTemplate.get(Employee.class, pid);
		return employee;
	}
}
