package com.example.restwsdemo.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ArtistResponse {

    private List<Artist> songsartists;

    public List<Artist> getArtists() {
        return songsartists;
    }

    public void setArtists(List<Artist> songsartists) {
        this.songsartists = songsartists;
    }

}
