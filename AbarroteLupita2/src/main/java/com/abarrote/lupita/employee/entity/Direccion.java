package com.abarrote.lupita.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DIRECCION")
public class Direccion {
	
	@Id
	@Column(name ="ID_DIRECCION")
	private long id;
	@Column(name = "COLONIA")
	private String colonia;
	@Column(name= "MUNICIPIO")
	private String municipio;
	@Column(name="ESTADO")
	private String estado;
	@Column(name="PAIS")
	private String pais;
	
	@OneToOne(mappedBy="direcion", fetch=FetchType.LAZY)
	private Employee employee;
	
	public Direccion() {
	}
	public Direccion(long id, String colonia, String municipio, String estado, String pais) {
		this.id = id;
		this.colonia = colonia;
		this.municipio = municipio;
		this.estado = estado;
		this.pais = pais;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the colonia
	 */
	public String getColonia() {
		return colonia;
	}
	/**
	 * @param colonia the colonia to set
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}
	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Direccion [id=" + id + ", colonia=" + colonia + ", municipio=" + municipio + ", estado=" + estado
				+ ", pais=" + pais + ", employee=" + employee.getEmpName() + "]";
	}
	
	

}
