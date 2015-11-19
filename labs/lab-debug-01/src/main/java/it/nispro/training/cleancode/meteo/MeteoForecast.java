package it.nispro.training.cleancode.meteo;

import java.util.Date;

public class MeteoForecast {

	private String city;
	private Date date;
	private int min;
	private int max;
	private String condition;

	public MeteoForecast(String city, Date date, int min,
			int max, String condition) {
				this.city = city;
				this.date = date;
				this.min = min;
				this.max = max;
				this.condition = condition;
	}

	@Override
	public String toString() {
		return "MeteoForecast [city=" + city + ", date=" + date + ", min="
				+ min + ", max=" + max + ", condition=" + condition + "]";
	}

	
}
