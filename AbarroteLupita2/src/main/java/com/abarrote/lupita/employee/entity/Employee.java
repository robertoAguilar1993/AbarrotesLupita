package com.abarrote.lupita.employee.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
@Entity
@Table(name = "EMPLOYEE", schema="ADMIN")
public class Employee implements Serializable{

	//Autor
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "emp_id")
    private long empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_alias")
    private String empAlias;
    @Column(name = "emp_password")
    private String empPassword;
    @Column(name = "emp_dni")
    private String empDni;
    @Column(name = "emp_email")
    private String empEmail;
    @OneToOne(cascade= {CascadeType.ALL})
    @JoinColumn(name ="ID_DIRECCION")
    private Direccion direcion;
    
    @OneToMany(mappedBy="emplo", cascade=CascadeType.ALL)
    private List<Task> task= new ArrayList<>();

	

	public Employee(long empId, String empName, String empAlias, String empPassword, String empDni, String empEmail) {
		this.empId = empId;
		this.empName = empName;
		this.empAlias = empAlias;
		this.empPassword = empPassword;
		this.empDni = empDni;
		this.empEmail = empEmail;
	}
	public Employee() {
	}
	/**
	 * @return the empId
	 */
	public long getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empAlias
	 */
	public String getEmpAlias() {
		return empAlias;
	}
	/**
	 * @param empAlias the empAlias to set
	 */
	public void setEmpAlias(String empAlias) {
		this.empAlias = empAlias;
	}
	/**
	 * @return the empPassword
	 */
	public String getEmpPassword() {
		return empPassword;
	}
	/**
	 * @param empPassword the empPassword to set
	 */
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	/**
	 * @return the empDni
	 */
	public String getEmpDni() {
		return empDni;
	}
	/**
	 * @param empDni the empDni to set
	 */
	public void setEmpDni(String empDni) {
		this.empDni = empDni;
	}
	/**
	 * @return the empEmail
	 */
	public String getEmpEmail() {
		return empEmail;
	}
	/**
	 * @param empEmail the empEmail to set
	 */
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	
	
	
	/**
	 * @return the direcion
	 */
	public Direccion getDirecion() {
		return direcion;
	}
	/**
	 * @param direcion the direcion to set
	 */
	public void setDirecion(Direccion direcion) {
		this.direcion = direcion;
	}
	
	
	
	/**
	 * @return the task
	 */
	public List<Task> getTask() {
		return task;
	}
	/**
	 * @param task the task to set
	 */
	public void setTask(List<Task> task) {
		this.task = task;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAlias=" + empAlias + ", empPassword="
				+ empPassword + ", empDni=" + empDni + ", empEmail=" + empEmail + ", direcion=" + direcion + "]";
	}

	
	

	
	
}
