package com.abarrote.lupita.employee.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;

import com.abarrote.lupita.employee.entity.Employee;

public class EmployeeDaoImp implements EmployeeDao{
	@Autowired
	private  EntityManager manager;
	@Autowired
	private  EntityManagerFactory emf;

	@Override
	@SuppressWarnings("unchecked")
	public  List<Employee> getListEmployee() {
		// TODO Auto-generated method stub
		emf= Persistence.createEntityManagerFactory("abarroteAplication");
		manager=emf.createEntityManager();
		List<Employee> employee= (List<Employee>)manager.createQuery("FROM Employee").getResultList();
		return employee;
	}
	/*
	public static void main(String args[]) {
		EmployeeDao o= new EmployeeDaoImp();
		System.out.println(o.getListEmployee().size());
	}
*/
	/**
	 * @return the manager
	 */
	public EntityManager getManager() {
		return manager;
	}

	/**
	 * @param manager the manager to set
	 */
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @return the emf
	 */
	public EntityManagerFactory getEmf() {
		return emf;
	}

	/**
	 * @param emf the emf to set
	 */
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
		

}
