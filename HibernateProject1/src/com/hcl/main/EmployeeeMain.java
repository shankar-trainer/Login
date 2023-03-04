package com.hcl.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hcl.model.Employee;

public class EmployeeeMain {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration().configure();//read hibernate.cfg.xml
		SessionFactory sf = configuration.buildSessionFactory();
		
		Session session = sf.openSession();// wrapped connection
		Transaction transaction = session.getTransaction();
		
		
		Employee employee=new Employee();
		employee.setId(10001);
		employee.setName("anand kumar");
		employee.setSalary(12000);
		
		transaction.begin();
		session.save(employee);
		transaction.commit();
		System.out.println("Record added ");
		
	}
}
