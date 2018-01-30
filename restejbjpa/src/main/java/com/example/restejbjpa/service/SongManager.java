package com.example.restejbjpa.service;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.restejbjpa.domain.Song;

@Stateless
public class SongManager {

	@PersistenceContext
	EntityManager em;

	public Song getSong(Integer Id) {
		return em.find(Song.class, Id);
	}
	public void addSong(Song song) {
		em.persist(song);
	}
	public void deleteSong(Integer id){
		em.remove(em.find(Song.class,id));
	}
	@SuppressWarnings("unchecked")
	public List<Song> getAllSongs(){
		return em.createNamedQuery("song.all").getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Song> findById(int id){
        return em.createNamedQuery("song.findById").setParameter("id", id).getResultList();
    }
	public void deleteAllSongs(){
		em.createNamedQuery("song.deleteAll").executeUpdate();
	}
	@SuppressWarnings("unchecked")
	public List<Object[]> getSongsBySerial(String serial){
		return em.createNamedQuery("serial.findBySerial").setParameter("serial", serial).getResultList();
	}
}

