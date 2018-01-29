package com.example.restwsdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.restwsdemo.domain.Artist;


@Stateless
public class ArtistManager {

    @PersistenceContext
    EntityManager em;

    public void addArtist(Artist artist) {
        em.persist(artist);
    }

    public Artist getArtist(Integer Id) {
        return em.find(Artist.class, Id);
    }

    public void deleteArtist(Integer id){

        em.remove(em.find(Artist.class,id));
    }

    public List<Artist> getAllArtists(){
        return new ArrayList<>();
    }

}
