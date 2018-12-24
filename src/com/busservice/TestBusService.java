package com.busservice;

public class TestBusService {

	public static void main(String[] args) {
		String FromCity = "C1";
		String ToCity = "C3";
		int NumPassengers = 3;
		System.out.println("Input Data");
		System.out.println("====================");
		System.out.println("From City : " + FromCity);
		System.out.println("To City : " + ToCity);
		System.out.println("Number of Passengers : " + NumPassengers);
		System.out.println("++++++++++++++++++++");
		System.out.println("Results");
		System.out.println("====================");
		Travel travel = Travel.getInstance();
		APSRTC apsrtc = new APSRTC();
		KSRTC ksrtc = new KSRTC();
		travel.planTravel(apsrtc, FromCity, ToCity);
		travel.planTravel(ksrtc, FromCity, ToCity);
		Deal deal = new Deal();
		KSRTCdiscount kdisc= new KSRTCdiscount();
		APSRTCdiscount apdisc = new APSRTCdiscount();
		deal.getDeal(kdisc, NumPassengers);
		deal.getDeal(apdisc, NumPassengers);

	}
}
