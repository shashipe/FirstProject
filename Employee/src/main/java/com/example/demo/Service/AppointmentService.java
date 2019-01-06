package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.Entity.AppointmentEntity;
import com.example.demo.Entity.UserDetails;
import com.example.demo.dao.Appointmentdao;
@Service
public class AppointmentService {
 @Autowired Appointmentdao appointmentdao;
 Optional<AppointmentEntity> appointmentEntity;
	
	public AppointmentEntity save(AppointmentEntity AppointmentEntity) {
		
		appointmentdao.save(AppointmentEntity);
		return null;
	}

	

	public void update(AppointmentEntity appointmentEntity1, Long id) {
		Optional<AppointmentEntity> appointmentEntity=appointmentdao.findById(id);	
		
	}

}