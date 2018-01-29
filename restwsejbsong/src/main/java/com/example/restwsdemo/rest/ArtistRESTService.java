package com.example.restwsdemo.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restwsdemo.domain.Artist;
import com.example.restwsdemo.service.ArtistManager;

@Path("artist")
@Stateless
public class ArtistRESTService {

    @Inject
    private ArtistManager am;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Artist> getArtist() {
        return am.getAllArtists();
    }

    @GET
    @Path("/{songArtistId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Artist getSongArtist(@PathParam("songArtistId") Integer id) {
        Artist a = am.getArtist(id);
        return a;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSongArtist(Artist artist) {
        am.addArtist(artist);

        return Response.status(201).entity("Success").build();
    }

    @DELETE
    public Response clearArtists() {
        return Response.status(200).build();
    }

}
