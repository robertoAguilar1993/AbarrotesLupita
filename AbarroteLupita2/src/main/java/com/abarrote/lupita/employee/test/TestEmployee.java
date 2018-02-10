package com.abarrote.lupita.employee.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abarrote.lupita.employee.entity.Direccion;
import com.abarrote.lupita.employee.entity.Employee;
import com.abarrote.lupita.employee.entity.Task;

public class TestEmployee {
/*
	private static EntityManager manager;
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		emf= Persistence.createEntityManagerFactory("abarroteAplication");
		manager=emf.createEntityManager();
	//	Employee o = new Employee(2l,"Beto Aguilar","GDBbeto","123","dvnskdjvns","roberto.aguilar@meltsan.com");
	//	Direccion di= manager.find(Direccion.class, 1l);
//		o.setDirecion(new Direccion(2l,"alto","trinitaria","chiapas","mexico"));
	//S	o.setDirecion(di);
		
	//addEmployee(o);
	//	printfEmployee();	
	//	modifyEmployee(3l);
	//	printfEmployee();
	//	modifiMargeEmployee(o);
	//	printfEmployee();
		//removeEmployee(2l);
		//printfEmployee();
		
		//printfEmployeeID(1l);
		
		printfEmployeeTask();

		
	}
	
	public static void  removeEmployee(long id) {
		manager.getTransaction().begin();
		Employee emp = manager.find(Employee.class, id);
		manager.remove(emp);
		manager.getTransaction().commit();
	}
	public static void modifyEmployee(long id) {
		manager.getTransaction().begin();
		Employee emp = manager.find(Employee.class, id);
		emp.setEmpName("Antonio Aguilar");
		manager.getTransaction().commit();
	}
	public static void modifiMargeEmployee(Employee e) {
		manager.getTransaction().begin();
		e=manager.merge(e);
		e.setEmpName("Roberto Antonio Aguilar");
		manager.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public static void printfEmployee() {
		List<Employee> employee= (List<Employee>)manager.createQuery("FROM Employee").getResultList();
		System.out.println("Hay " + employee.size() + " Empleados");
		for(Employee emp:employee) {
			System.out.println(emp.toString());
		}
		
	}
	public static void printfEmployeeID(long id) {
		Employee emp = manager.find(Employee.class, id);
		System.out.println(emp.toString());
	}
	
	public static void addEmployee(Employee emp) {
		manager.getTransaction().begin();
		manager.persist(emp);
		manager.getTransaction().commit();		
	}
	@SuppressWarnings("unchecked")
	public static void printfEmployeeTask() {
		Employee employee= manager.find(Employee.class, 2L);
		System.out.println(employee);
		for(Task tesk:employee.getTask()) {
			System.out.println(tesk.toString());
		}
	}
	*/

}
