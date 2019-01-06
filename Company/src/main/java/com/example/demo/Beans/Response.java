package com.example.demo.Beans;

public class Response {
	private String status;
	private String statusCode;
	private String  message;
	
	
	private Employee employee;
	

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Response()
	{
		
	}

	public Response(String status, String statusCode, String message, Employee employee) {
		super();
		this.status = status;
		this.statusCode = statusCode;
		this.message = message;
		this.employee = employee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
