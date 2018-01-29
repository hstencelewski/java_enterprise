package com.example.restwsdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.restwsdemo.domain.Song;

@Stateless
public class SongManager {

	@PersistenceContext
	EntityManager em;

	public void addSong(Song song) {
		em.persist(song);
	}

	public void deleteSong(Integer id){

		em.remove(em.find(Song.class,id));
	}

	public Song getSong(Integer Id) {
		return em.find(Song.class, Id);
	}
	
	public List<Song> getAllSongs(){
		return new ArrayList<>();
	}

}
