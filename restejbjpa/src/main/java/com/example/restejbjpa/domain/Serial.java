package com.example.restejbjpa.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;

@XmlRootElement
@Entity
@NamedQueries({
    	@NamedQuery(name = "serial.all", query = "Select ser from Serial ser"),
    	@NamedQuery(name = "serial.findById", query = "Select ser from Serial ser where ser.id = :id")
})

public class Serial {
    public @interface NamedQueries {

	}
	private int id;
    private String serial = "";

    public Serial() {
    }

    public Serial(String serial) {
        super();

        this.serial = serial;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
}
