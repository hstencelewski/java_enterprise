package com.example.restejbjpa.service;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.example.restejbjpa.domain.Genre;

@Stateless
public class GenreManager {

    @PersistenceContext
    EntityManager em;

    public Genre getGenre(Integer Id) {
        return em.find(Genre.class, Id);
    }
    public void addGenre(Genre genre) {
        em.persist(genre);
    }
    public void deleteGenre(Integer id){
    	em.remove(em.find(Genre.class,id));
    }
    public List<Genre> getAllGenres(){
        return new ArrayList<>();
    }
    @SuppressWarnings("unchecked")
    public List<Genre> findById(int id){
        return em.createNamedQuery("genre.findById").setParameter("id", id).getResultList();
    }
}