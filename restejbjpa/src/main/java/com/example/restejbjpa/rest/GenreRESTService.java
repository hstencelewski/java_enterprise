package com.example.restejbjpa.rest;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restejbjpa.domain.Genre;
import com.example.restejbjpa.service.GenreManager;

@Path("genre")
@Stateless
public class GenreRESTService {

    @EJB
    private GenreManager gm;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Genre> getGenre() {
        return gm.getAllGenres();
    }
    @GET
    @Path("/{songGenreId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Genre getSongGenre(@PathParam("songGenreId") Integer id) {
        Genre g = gm.getGenre(id);
        return g;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSongGenrebyPOSTMAN(Genre genre) {
        gm.addGenre(genre);
        return Response.status(201).entity("Success").build();
    }
    @GET
    @Path("/find/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Genre> getGenreById(@PathParam("id") int id) {
        return gm.findById(id);
    }
    @DELETE
    @Path("/{genreId}")
    public Response deleteGenre(@PathParam("genreId") Integer id) {
        gm.deleteGenre(id);
        return Response.status(201).entity("Success").build();
    }
}
