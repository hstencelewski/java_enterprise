package com.example.restwsdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.restwsdemo.domain.Code;

@Stateless
public class CodeManager {

    @PersistenceContext
    EntityManager em;

    public void addCode(Code code) {
        em.persist(code);
    }

    public Code getCode(Integer Id) {
        return em.find(Code.class, Id);
    }

    public void deleteCode(Integer id){

        em.remove(em.find(Code.class,id));
    }

    public List<Code> getAllCodes(){
        return new ArrayList<>();
    }

}
