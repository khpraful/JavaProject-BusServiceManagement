package com.busservice;

public class KSRTCdiscount implements Discounts {

	double discount;

	public void getDiscount(int NumPassengers) {
		if (NumPassengers > 1 && NumPassengers <= 2) {
			discount = 0.05;
		} else if (NumPassengers > 2 && NumPassengers <= 3) {
			discount = 0.01;
		} else if (NumPassengers > 3 && NumPassengers <= 4) {
			discount = 0.15;
		} else if (NumPassengers > 4) {
			discount = 0.20;
		} else {
			discount = 0;
		}
		System.out
				.println(discount
						+ " discount is applicable on KSRTC based on number of passengers specified ");

	}

}
