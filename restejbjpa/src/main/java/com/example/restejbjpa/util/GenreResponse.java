package com.example.restejbjpa.util;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import com.example.restejbjpa.domain.Genre;

@XmlRootElement
public class GenreResponse {

    private List<Genre> genres;
    
    public List<Genre> getGenres() {
        return genres;
    }
    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}