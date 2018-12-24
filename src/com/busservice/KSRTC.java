package com.busservice;

import java.util.ArrayList;
import java.util.Arrays;

public class KSRTC implements BusService {

	private ArrayList<String> CityList = new ArrayList<String>(Arrays.asList(
			"C1", "C2", "C3", "C4", "C5"));
	private double fare;

	public void getService(String FromCity, String ToCity) {
		if (CityList.contains(FromCity) && CityList.contains(ToCity)) {
			System.out.println("KSRTC service is available on selected route");
			fare = returnfare(FromCity, ToCity);
			System.out.println("Service: KSRTC | " + "From City: " + FromCity
					+ " | " + "To City: " + ToCity + " | " + "Fare: " + fare);
		} else {
			System.out
					.println("KSRTC service is not available on selected route");
		}
	}

	public double returnfare(String FromCity, String ToCity) {

		if (FromCity == "C1" && ToCity == "C2") {
			return 1;
		} else if (FromCity == "C1" && ToCity == "C3") {
			return 2;
		} else if (FromCity == "C1" && ToCity == "C4") {
			return 3;
		} else if (FromCity == "C1" && ToCity == "C5") {
			return 4;
		} else if (FromCity == "C2" && ToCity == "C3") {
			return 1;
		} else if (FromCity == "C2" && ToCity == "C4") {
			return 2;
		} else if (FromCity == "C2" && ToCity == "C5") {
			return 3;
		} else if (FromCity == "C3" && ToCity == "C4") {
			return 1;
		} else if (FromCity == "C3" && ToCity == "C5") {
			return 2;
		} else if (FromCity == "C4" && ToCity == "C5") {
			return 1;
		}
		return 0;
	}

}
