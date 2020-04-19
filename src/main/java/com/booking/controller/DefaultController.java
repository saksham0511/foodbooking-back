package com.booking.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.bean.UserException;

@CrossOrigin(origins="*")
@RestController
public class DefaultController {

	@GetMapping("")
	public String hello() throws UserException {
		return "hello";
	}
	
}
