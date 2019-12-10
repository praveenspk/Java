package com.spk.map;

import java.util.Objects;

class CityReport {
	String city;
	Long counter;

	public CityReport(String city) {
		this.city = city;
		this.counter = 1L;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CityReport that = (CityReport) o;
		return Objects.equals(city, that.city);
	}

	@Override
	public int hashCode() {

		return Objects.hash(city);
	}

	@Override
	public String toString() {
		return "CityReport{" + "city='" + city + '\'' + ", counter=" + counter + '}';
	}
}