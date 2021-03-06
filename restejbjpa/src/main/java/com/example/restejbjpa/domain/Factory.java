package com.example.restejbjpa.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@NamedQueries({
	@NamedQuery(name = "factory.all", query = "Select f from Factory f"),
    @NamedQuery(name = "factory.findById", query = "Select f from Factory f where f.id = :id")
})

public class Factory {
    private int id;
    private String name = "";

    public Factory() {
    }

    public Factory(String name) {
        super();
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getId() { 
    	return id;
    }
    public void setId(int id) { 
    	this.id = id;
    }
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}