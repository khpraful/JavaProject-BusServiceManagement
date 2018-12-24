package com.busservice;

import java.util.ArrayList;
import java.util.Arrays;

public class APSRTC implements BusService {

	private ArrayList<String> CityList = new ArrayList<String>(Arrays.asList(
			"C1", "C2", "C3"));
	private double fare;

	public void getService(String FromCity, String ToCity) {
		if (CityList.contains(FromCity) && CityList.contains(ToCity)) {
			System.out.println("APSRTC service is available on selected route");
			fare = returnfare(FromCity, ToCity);
			System.out.println("Service: APSRTC | " + "From City: " + FromCity
					+ " | " + "To City: " + ToCity + " | " + "Fare: " + fare);
		} else {
			System.out
					.println("APSRTC service is not available on selected route");
		}
	}

	public double returnfare(String FromCity, String ToCity) {
		if (FromCity == "C1" && ToCity == "C2") {
			return 1;
		} else if (FromCity == "C1" && ToCity == "C3") {
			return 2;
		} else if (FromCity == "C2" && ToCity == "C3") {
			return 1;
		}
		return 0;
	}

}
