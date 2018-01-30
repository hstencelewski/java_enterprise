package com.example.restejbjpa.service;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.restejbjpa.domain.Factory;

@Stateless
public class FactoryManager {

    @PersistenceContext
    EntityManager em;
    
    public Factory getFactory(Integer Id) {
        return em.find(Factory.class, Id);
    }
    public void addFactory(Factory factory) {
        em.persist(factory);
    }
    public void deleteFactory(Integer id){
    	em.remove(em.find(Factory.class,id));
    }
    public List<Factory> getAllFactories(){
        return new ArrayList<>();
    }
    @SuppressWarnings("unchecked")
    public List<Factory> findById(int id){
        return em.createNamedQuery("factory.findById").setParameter("id", id).getResultList();
    }
}