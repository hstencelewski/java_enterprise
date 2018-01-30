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

import com.example.restejbjpa.domain.Serial;
import com.example.restejbjpa.service.SerialManager;

@Path("serial")
@Stateless
public class SerialRESTService {

    @EJB
    private SerialManager sm;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Serial> getSerial() {
        return sm.getAllSerials();
    }
    @GET
    @Path("/{serialId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Serial getSongSerial(@PathParam("serialId") Integer id) {
        Serial ser = sm.getSerial(id);
        return ser;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSongSerialbyPOSTMAN(Serial serial) {
        sm.addSerial(serial);
        return Response.status(201).entity("Success").build();
    }
    @DELETE
    @Path("/{serialid}")
    public Response deleteSerial(@PathParam("serialId") Integer id) {
        sm.deleteSerial(id);
        return Response.status(201).entity("Success").build();
    }
    @GET
    @Path("/find/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Serial> getSerialById(@PathParam("id") int id) {
        return sm.findById(id);
    }
}
