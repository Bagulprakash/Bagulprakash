package com.kiranacademy.InfrastructureStatistic;

public class Bridge {

	private String city;
	private int number;
	private String length;
	private String width;

	public Bridge(String city, int number, String length, String width) {
		super();
		this.city = city;
		this.number = number;
		this.length = length;
		this.width = width;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Bridge [city=" + city + ", number=" + number + ", length=" + length + ", width=" + width + "]";
	}

}
