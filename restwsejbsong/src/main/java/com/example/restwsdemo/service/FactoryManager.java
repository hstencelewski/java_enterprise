package com.example.restwsdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.restwsdemo.domain.Factory;

@Stateless
public class FactoryManager {

    @PersistenceContext
    EntityManager em;

    public void addFactory(Factory factory) {
        em.persist(factory);
    }

    public void deleteFactory(Integer id){

        em.remove(em.find(Factory.class,id));
    }

    public Factory getFactory(Integer Id) {
        return em.find(Factory.class, Id);
    }

    public List<Factory> getAllSongsFactory(){
        return new ArrayList<>();
    }

}
