package com.example.demo.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="appointment")
public class AppointmentEntity {
	@Id
	private Long id;
	private Date date;
	private String location;
	private String description;
	private boolean confirmed;
	public AppointmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentEntity(Long id, Date date, String location, String description, boolean confirmed) {
		super();
		this.id = id;
		this.date = date;
		this.location = location;
		this.description = description;
		this.confirmed = confirmed;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

}
