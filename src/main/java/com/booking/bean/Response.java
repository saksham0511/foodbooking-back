package com.booking.bean;

public class Response {

	private int status;
	private Object body;
	private String message;
	
	public Response(int status, Object body, String message) {
		super();
		this.status = status;
		this.body = body;
		this.message = message;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
