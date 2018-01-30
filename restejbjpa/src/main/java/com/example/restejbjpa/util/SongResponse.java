package com.example.restejbjpa.util;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import com.example.restejbjpa.domain.Song;

@XmlRootElement
public class SongResponse {
	
	private List<Song> songs = new ArrayList<>();

	public List<Song> getSongs() {
		return songs;
	}
	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}
}