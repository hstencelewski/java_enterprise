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

import com.example.restejbjpa.domain.Factory;
import com.example.restejbjpa.service.FactoryManager;

@Path("factory")
@Stateless
public class FactoryRESTService {

    @EJB
    private FactoryManager fm;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Factory> getFactory() {
        return fm.getAllFactories();
    }
    @GET
    @Path("/{factoryId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Factory getSongFactory(@PathParam("songFactoryId") Integer id) {
        Factory f = fm.getFactory(id);
        return f;
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSongFactorybyPOSTMAN(Factory factory) {
        fm.addFactory(factory);
        return Response.status(201).entity("Success").build();
    }
    @DELETE
    @Path("/delete/{Id}")
    public Response deleteFactory(@PathParam("Id") Integer id) {
        fm.deleteFactory(id);
        return Response.status(201).entity("Success").build();
    }
}
