package com.example.restwsdemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity

public class Code {
    private int id;
    private String code = "";

    public Code() {
    }

    public Code(String code) {
        super();
        this.code = code;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

}
