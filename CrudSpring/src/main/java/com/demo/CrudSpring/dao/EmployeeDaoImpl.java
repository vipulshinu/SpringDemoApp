package com.demo.CrudSpring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.CrudSpring.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private EmployeeDao employeeDao;
	
	public List<Employee> getEmpDetails()
	{
		Criteria criteria=sessionFactory.openSession().createCriteria(Employee.class);
		return criteria.list();
	}

	public Employee getEmployeeById(int id )
	{
		Employee emp = null;
		Criteria criteria = sessionFactory.openSession().createCriteria(Employee.class);
		// Criterion price = Restrictions.gt("i",new Double(25.0));
		criteria.add(Restrictions.eq("id", id));
		criteria.setMaxResults(1);
		emp = (Employee) criteria.uniqueResult();
		return emp;
	}
	
	public String deleteEmployee(int id)
	{
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee camp = (Employee ) session.createCriteria(Employee.class)
                   .add(Restrictions.eq("id", id)).uniqueResult();
		session.delete(camp);
		tx.commit();
		session.close();
		return id+"deleted!!";
	}
	
	public 	String updateEmp(Employee employee)
	{
		// employee.setCreationTime(date);
		 Session session = sessionFactory.openSession();
		 Transaction tx = session.beginTransaction();
		 session.update(employee);
		 tx.commit();
		 session.close();
		 return "updated!!";
	}
	
	public String createEmployee(Employee employee)
	{
//		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
//		partner.setCreationTime(date);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();
		return "created!!";
	}

	@Override
	public int getAllEmployee(Employee employee) {
		int available = employeeDao.getAllEmployee(employee);
		return available;
	}


}
