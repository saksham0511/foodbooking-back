package com.booking.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.booking.bean.Constant;
import com.booking.bean.Response;
import com.booking.bean.User;

@Service
public class LoginService {

	private static Map<String, User> userDb = new HashMap<String, User>();

	public Response isValidCredential(final User user) {
		if (user != null && userDb.get(user.getEmail()) != null
				&& userDb.get(user.getEmail()).getPassword().equals(user.getPassword()))
			return new Response(Constant.STATUS_SUCCESS, userDb.get(user.getEmail()), "");

		else
			return new Response(Constant.STATUS_FAIL, null, "Invalid Credentials");
	}

	public Response createOrUpdateUser(final User user) {

		if (user == null)
			return new Response(Constant.STATUS_FAIL, null, "Insufficient Data : Unable to create/update user record");

		// if record available in DB then delete it and create a new one
		boolean isRecordAvailable = userDb.get(user.getEmail()) != null;
		if (isRecordAvailable) {
			userDb.remove(user.getEmail());
		}

		userDb.put(user.getEmail(), user);

		return new Response(Constant.STATUS_SUCCESS, userDb.get(user.getEmail()), "");
	}
}
