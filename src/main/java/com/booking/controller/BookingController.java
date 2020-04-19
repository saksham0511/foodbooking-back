package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.bean.Booking;
import com.booking.bean.Response;
import com.booking.service.BookingService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	BookingService bookingSrvc;
	
	@PostMapping("/fetchAll")
	public Response fetchAll(@RequestBody Booking booking) {
		return bookingSrvc.getAllBookings();
	}
	
	@PostMapping("/delete")
	public Response delete(@RequestBody Booking booking) {
		return bookingSrvc.deleteBooking(booking);
	}
	
	@PostMapping("/create")
	public Response create(@RequestBody Booking booking) {
		return bookingSrvc.createBooking(booking);
	}
	
}
