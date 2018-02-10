package com.abarrote.lupita.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "TASK")
public class Task {
	
	
	//libros
	@Id
	@Column(name="task_id")
	private long taskId;
	
	@Column(name="task_name")
	private String taskName;
	
	@Column(name="task_dateini")
	private Date taskDateIni;
	
	@Column(name="task_date_end")
	private Date taskDateEnd;
	
	@Column(name="task_status")
	private int taskStatus;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="emp_id")
	private Employee emplo;
	
	
	public Task() {
		
	}
	public Task(long taskId, String taskName, Date taskDateIni, Date taskDateEnd, int taskStatus) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDateIni = taskDateIni;
		this.taskDateEnd = taskDateEnd;
		this.taskStatus = taskStatus;
	}



	/**
	 * @return the taskId
	 */
	public long getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}

	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * @return the taskDateIni
	 */
	public Date getTaskDateIni() {
		return taskDateIni;
	}

	/**
	 * @param taskDateIni the taskDateIni to set
	 */
	public void setTaskDateIni(Date taskDateIni) {
		this.taskDateIni = taskDateIni;
	}

	/**
	 * @return the taskDateEnd
	 */
	public Date getTaskDateEnd() {
		return taskDateEnd;
	}

	/**
	 * @param taskDateEnd the taskDateEnd to set
	 */
	public void setTaskDateEnd(Date taskDateEnd) {
		this.taskDateEnd = taskDateEnd;
	}

	/**
	 * @return the taskStatus
	 */
	public int getTaskStatus() {
		return taskStatus;
	}

	/**
	 * @param taskStatus the taskStatus to set
	 */
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}



	


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", taskDateIni=" + taskDateIni + ", taskDateEnd="
				+ taskDateEnd + ", taskStatus=" + taskStatus + "]";
	}

	

}
