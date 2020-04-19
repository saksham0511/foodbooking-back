package com.booking.bean;

public class Booking {

	private String bookingNo;
	private User user;
	private String bookingType; //occasional or regular
	private String packageWt; 	//small, medium, large
	private String price;
	private Location hotelLocation;
	
	public String getBookingNo() {
		return bookingNo;
	}
	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	public String getPackageWt() {
		return packageWt;
	}
	public void setPackageWt(String packageWt) {
		this.packageWt = packageWt;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Location getHotelLocation() {
		return hotelLocation;
	}
	public void setHotelLocation(Location location) {
		this.hotelLocation = location;
	}
	
}
