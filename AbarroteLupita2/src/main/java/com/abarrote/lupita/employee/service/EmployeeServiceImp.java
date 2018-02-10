package com.abarrote.lupita.employee.service;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abarrote.lupita.employee.dao.EmployeeDao;
import com.abarrote.lupita.employee.entity.Employee;

public class EmployeeServiceImp implements EmployeeService{


	private EmployeeDao employeDao;
	
	@Override
	public List<Employee> getListEmployee() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "aqui");
		return employeDao.getListEmployee();
	}

	/**
	 * @return the employeDao
	 */
	public EmployeeDao getEmployeDao() {
		return employeDao;
	}

	/**
	 * @param employeDao the employeDao to set
	 */
	public void setEmployeDao(EmployeeDao employeDao) {
		this.employeDao = employeDao;
	}	
}
