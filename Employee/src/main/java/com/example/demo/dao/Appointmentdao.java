package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Beans.Appointment;
import com.example.demo.Entity.AppointmentEntity;

public interface Appointmentdao extends CrudRepository<AppointmentEntity, Long>{

	Appointment findById(String id);

}
