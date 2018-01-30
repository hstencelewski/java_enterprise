package com.example.restejbjpa.rest;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.example.restejbjpa.domain.Song;
import com.example.restejbjpa.service.SongManager;

@Path("song")
@Stateless
public class SongRESTService {

    @EJB
    private SongManager sm;
    
    EntityManager em;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Song> getSongs() {
        return sm.getAllSongs();
    }
    @GET
    @Path("/{songId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Song getId(@PathParam("songId") Integer Id) {
        Song s = sm.getSong(Id);
        return s;
    }
    @GET
    @Path("/find/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Song> getSongById(@PathParam("id") int id) {
        return sm.findById(id);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSongbyPOSTMAN(Song song) {
        sm.addSong(song);
        return Response.status(201).entity("Song").build();
    }
    @DELETE
    @Path("/{songId}")
    public Response deleteSong(@PathParam("songId") Integer id) {
    	sm.deleteSong(id);
    	return Response.status(201).entity("Success").build();
    }
    @GET
    @Path("/find/serial/{serial}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSongsBySerial(@PathParam("serial") String serial) {

        List<Object[]> rawSongs = sm.getSongsBySerial(serial);
        JsonArrayBuilder songs = Json.createArrayBuilder();

        for (Object[] rawSong : rawSongs) {

            String Serial = (String) rawSong[0];
            String Songname = (String) rawSong[1];
            String Bandname = (String) rawSong[2];
            int Yor = (int) rawSong[3];
            int Price = (int) rawSong[4];

            songs.add(Json.createObjectBuilder()
                    .add("serial", Serial)
                    .add("songname", Songname)
                    .add("bandname", Bandname)
                    .add("yor", Yor)
                    .add("price", Price));
        }
        JsonObject json = Json.createObjectBuilder().add("result", songs).build();
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }
}