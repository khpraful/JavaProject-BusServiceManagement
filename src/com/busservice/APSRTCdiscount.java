package com.busservice;

public class APSRTCdiscount implements Discounts {
	double discount;

	public void getDiscount(int NumPassengers) {
		if (NumPassengers > 1 && NumPassengers <= 2) {
			discount = 0.075;
		} else if (NumPassengers > 2 && NumPassengers <= 3) {
			discount = 0.0125;
		} else if (NumPassengers > 3 && NumPassengers <= 4) {
			discount = 0.175;
		} else if (NumPassengers > 4) {
			discount = 0.225;
		} else {
			discount = 0;
		}
		System.out
				.println(discount
						+ " discount is applicable on APSRTC based on number of passengers specified ");

	}

}
