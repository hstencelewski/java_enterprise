package com.example.servletjspdemo.domain;

public class Song {
	
	private String songname = "unknown";
	private String bandname = "unknown";
	private int yor = 0;
	private double price = 0.00;
	
	public Song() {
		super();
	}
	
	public Song(String songname, String bandname, int yor, double price) {
		super();
		this.songname = songname;
		this.bandname = bandname;
		this.yor = yor;
		this.price = price;
	}

	public String getsongname() {
		return songname;
	}
	public void setsongname(String songname) {
		this.songname = songname;
	}
	public String getbandname() {
		return bandname;
	}
	public void setbandname(String bandname) {
		this.bandname = bandname;
	}
	public int getyor() {
		return yor;
	}
	public void setyor(int yor) {
		this.yor = yor;
	}
	public double getprice() {
		return price;
	}
	public void setprice(double price) {
		this.price = price;
	}
}