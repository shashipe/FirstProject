package com.example.demo.Controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppointmentController {
	
	
	@GetMapping("/shashi")
	public String getMessage()
	{
		return "hello";
	}
	
	
}
