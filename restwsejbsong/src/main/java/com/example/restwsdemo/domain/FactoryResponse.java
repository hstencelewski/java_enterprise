package com.example.restwsdemo.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FactoryResponse {

    private List<Factory> factory;

    public List<Factory> getFactory() {
        return factory;
    }

    public void setFactory(List<Factory> factory) {
        this.factory = factory;
    }

}
