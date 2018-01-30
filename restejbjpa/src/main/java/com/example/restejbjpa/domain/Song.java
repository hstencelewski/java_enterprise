package com.example.restejbjpa.domain;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({
        @NamedQuery(name = "song.all", query = "Select s from Song s"),
        @NamedQuery(name = "song.findById", query = "Select s from Song s where s.id = :id"),
        @NamedQuery(name = "phone.findBySerial", query = "Select ser.serial, s.songname, s.bandname, s.price, s.yor from Song s JOIN s.serial ser where ser.serial = :serial")
})


@XmlRootElement
public class Song {
	private int id;
	private int yor;
	private String songname = "";
	private String bandname = "";
	private Factory factory;
	private Genre genre;
	private Serial serial;
	int price;

	public Song() {
	}

	public Song(int yor, String songname, String bandname, Factory factory, Genre genre, Serial serial, int price) {
		super();
		this.yor=yor;
		this.songname = songname;
		this.bandname = bandname;
		this.factory=factory;
		this.genre=genre;
		this.serial=serial;
		this.price=price;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getId() { 
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYor() {
		return yor;
	}
	public void setYor(int yor) {
		this.yor = yor;
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
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Factory getFactory() {
		return factory;
	}
	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public Serial getSerial() {
		return serial;
	}
	public void setSerial(Serial serial) {
		this.serial = serial;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}