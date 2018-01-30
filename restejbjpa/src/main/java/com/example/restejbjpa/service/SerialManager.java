package com.example.restejbjpa.service;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.restejbjpa.domain.Serial;

@Stateless
public class SerialManager {

    @PersistenceContext
    EntityManager em;

    public Serial getSerial(Integer Id) {
        return em.find(Serial.class, Id);
    }
    public void addSerial(Serial serial) {
        em.persist(serial);
    }
    public void deleteSerial(Integer id){
    	em.remove(em.find(Serial.class,id));
    }
    public List<Serial> getAllSerials(){
        return new ArrayList<>();
    }
    @SuppressWarnings("unchecked")
    public List<Serial> findById(int id){
        return em.createNamedQuery("serial.findById").setParameter("id", id).getResultList();
    }
}
