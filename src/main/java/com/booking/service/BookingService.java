package com.booking.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.booking.bean.Booking;
import com.booking.bean.Constant;
import com.booking.bean.Response;
import com.booking.bean.User;

@Service
public class BookingService {

	private static Map<String, Booking> bookingDb = new HashMap<String, Booking>();

	public Response getAllBookings() {
		return new Response(Constant.STATUS_SUCCESS, bookingDb.values(), "");
	}
	
	public Response deleteBooking(Booking booking) {
		if(booking != null && bookingDb.containsKey(booking.getBookingNo())){
			bookingDb.remove(booking.getBookingNo());
			return new Response(Constant.STATUS_SUCCESS, bookingDb.values(), "");
		}
		else {
			return new Response(Constant.STATUS_FAIL, null, "Data not found for booking number " + booking.getBookingNo());
		}
	}
	
	public Response createBooking(Booking booking) {
		if(booking != null) {
			bookingDb.put(booking.getBookingNo(), booking);
			return new Response(Constant.STATUS_SUCCESS, bookingDb.values(), "");
		}
		else {
			return new Response(Constant.STATUS_FAIL, null, "Insufficient data to create booking informations");
		}
	}
	
}
