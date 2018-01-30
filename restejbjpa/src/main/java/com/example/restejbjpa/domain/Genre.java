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
    @NamedQuery(name = "genre.all", query = "Select g from Genre g"),
    @NamedQuery(name = "genre.findById", query = "Select g from Genre g where g.id = :id")
})

public class Genre {
    private int id;
    private String name = "";

    public Genre() {
    }

    public Genre(String name) {
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