package com.bridgelabz.hotelmanagement;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
	List<Hotel> hotels = new ArrayList<>();

	/**
	 * This method is used to add hotel to the Hotel List
	 */
	public boolean addHotel(Hotel hotel) {
		return hotels.add(hotel);
	}
}
