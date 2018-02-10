package com.abarrote.lupita.employee.rest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abarrote.lupita.employee.entity.Employee;

@Component
@Path("employee")
public class EmployeeRest {

	
	 
	@SuppressWarnings("unchecked")
	@GET
	@Path("getListEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getListEmployee(){
		System.out.println(EmployeeRest.class);
		List<Employee> employee=null;
		try {
			// employee=(List<Employee>) sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
			 System.out.println(employee.size());
		   
		}catch (Exception e) {
			System.out.println(e.getMessage());
			}
		return employee;		
	}

	
}
