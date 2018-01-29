package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.servletjspdemo.domain.Song;

public class StorageService {
	
	private List<Song> songdb = new ArrayList<Song>();
	
	public void add(Song song){
		Song newSong = new Song(song.getsongname(), song.getbandname(), song.getyor(), song.getprice());
		songdb.add(newSong);
	}
	
	public List<Song> getAllSongs(){
		return songdb;
	}

private List<Song> shoppingBasket = new ArrayList<Song>();

public void addToBasket(Song basket){
	Song newBasketSong = new Song(basket.getsongname(), basket.getbandname(), basket.getyor(), basket.getprice());
	shoppingBasket.add(newBasketSong);
}

public void deleteFromBasket(String songname) {
	Iterator<Song> iter = shoppingBasket.iterator();
	while (iter.hasNext()) 
	{
	    Song song = iter.next();
	    if(song.getsongname().equals(songname))
	        iter.remove();
	    
	}
}

public List<Song> getBasket(){
	return shoppingBasket;
}


}

