package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.bean.Response;
import com.booking.bean.User;
import com.booking.bean.UserException;
import com.booking.service.LoginService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user")
public class LoginController {

	@Autowired
	LoginService loginSrvc;
	
	@PostMapping("/validate")
	public Response validateCredentials(@RequestBody User user) throws UserException {
		return loginSrvc.isValidCredential(user);
	}
	
	@PostMapping("/register")
	public Response createOrUpdateUser(@RequestBody User user) throws UserException {
		return loginSrvc.createOrUpdateUser(user);
	}
	
}
