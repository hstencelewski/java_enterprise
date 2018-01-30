package com.example.restejbjpa;
import static com.jayway.restassured.RestAssured.*;
import javax.ws.rs.core.MediaType;
import com.example.restejbjpa.domain.Serial;
import com.example.restejbjpa.domain.Genre;
import com.example.restejbjpa.domain.Factory;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.jayway.restassured.RestAssured;

public class SongServiceIT {
	
	private static final String GENRE_NAME = "Metal";
	private static final String FACTORY_NAME = "FULLBASS";
	private static final String SERIAL_NAME = "qwert";
	
	@BeforeClass
	public static void setUp(){
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/restejbjpa/api";
	}
	@Test
	public void addGenre(){
		//delete("/genre/").then().assertThat().statusCode(200);

		Genre genre = new Genre(GENRE_NAME);
		given().
	       contentType(MediaType.APPLICATION_JSON).
	       body(genre).
	    		when().
				post("/genre/").then().assertThat().statusCode(201);
	}
	@Test
	public void addFactory(){
		Factory factory = new Factory(FACTORY_NAME);
		given().
				contentType(MediaType.APPLICATION_JSON).
				body(factory).
				when().
				post("/factory/").then().assertThat().statusCode(201);
	}
	@Test
	public void addSerial(){
		Serial serial = new Serial(SERIAL_NAME);
		given().
				contentType(MediaType.APPLICATION_JSON).
				body(serial).
				when().
				post("/serial/").then().assertThat().statusCode(201);
	}
}
