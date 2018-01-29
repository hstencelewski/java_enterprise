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

import com.example.restwsdemo.domain.Song;
import com.example.restwsdemo.service.SongManager;

@Path("song")
@Stateless
public class SongRESTService {

	@Inject
	private SongManager sm;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Song> getSongs() {
		return sm.getAllSongs();
	}

	@GET
	@Path("/{SongId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Song getId(@PathParam("SongId") Integer Id) {
		Song s = sm.getSong(Id);
		return s;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addSong(Song song) {
		sm.addSong(song);

		return Response.status(201).entity("Song").build();
	}

	@DELETE
	@Path("/{SongId}")
	public Response deleteSong(@PathParam("SongId") Integer id) {

		sm.deleteSong(id);

		return Response.status(201).entity("Success").build();
	}

	@DELETE
	public Response clearSongs() {
		return Response.status(200).build();
	}

}
