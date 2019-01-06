package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErorrController {
@RequestMapping("/error")
public String sayError()
{
	return "page Not found";
	
}
}
