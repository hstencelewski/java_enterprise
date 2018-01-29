package com.example.restwsdemo.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Song {
	private int id;
	private int amount=1;
	private String songname = "";
	private String bandname = "";
	private Factory factory;
	private Artist artist;
	private Code code;
	private int price;

	public Song() {
	}

	public Song(int amount, String songname, String bandname, Factory factory, Artist artist, Code code, int price) {
		super();
		this.amount=amount;
		this.songname = songname;
		this.bandname = bandname;
		this.factory=factory;
		this.artist=artist;
		this.code=code;
		this.price=price;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount){
		this.amount=amount;
	}

	public String getSongname() {
		return songname;
	}

	public void setSongname(String songname) {
		this.songname = songname;
	}

	public String getBandname() {
		return bandname;
	}

	public void setBandname(String bandname) {
		this.bandname = bandname;
	}
	
	@ManyToOne
	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	@ManyToOne
	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	@OneToOne
	public Code getCode() {
		return code;
	}

	public void setCode(Code code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}


