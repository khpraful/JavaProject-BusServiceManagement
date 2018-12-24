package com.busservice;

public class Travel {

	static Travel obj = null;

	private Travel() {
	}

	public static Travel getInstance() {
		if (obj == null) {
			synchronized (Travel.class) {
				if (obj == null)
					obj = new Travel();
			}
		}
		return obj;
	}

	void planTravel(BusService service, String FromCity, String ToCity) {
		service.getService(FromCity, ToCity);

	}

}
