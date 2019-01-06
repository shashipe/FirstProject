package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Beans.User;
import com.example.demo.Entity.AppointmentEntity;
import com.example.demo.Service.AppointmentService;
@RestController
public class AppointmentController {
	
	@Autowired AppointmentService appointmentService;
	@GetMapping("/shashi")
	public String getMessage()
	{
		return "hello";
	}
	@PostMapping("/saveAppointment")
	public void saveAppointment(@RequestBody AppointmentEntity appointmentEntity)
	{
		appointmentService.save(appointmentEntity);
	}
	@PutMapping("/updateAppointment/{id}")
	public void updateAppointment(@RequestBody AppointmentEntity appointmentEntity, @PathVariable Long id)
	{
		appointmentService.update(appointmentEntity, id);
	}
	
}