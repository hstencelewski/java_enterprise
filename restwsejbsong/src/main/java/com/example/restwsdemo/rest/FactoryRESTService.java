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

import com.example.restwsdemo.domain.Factory;
import com.example.restwsdemo.service.FactoryManager;

@Path("factory")
@Stateless
public class FactoryRESTService {

    @Inject
    private FactoryManager fm;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Factory> getFactory() {
        return fm.getAllSongsFactory();
    }


    @GET
    @Path("/{songFactoryId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Factory getsongFactory(@PathParam("songFactoryId") Integer id) {
        Factory f = fm.getFactory(id);
        return f;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addsongFactory(Factory factory) {
        fm.addFactory(factory);

        return Response.status(201).entity("Success").build();
    }

    @DELETE
    public Response clearFactory() {
        return Response.status(200).build();
    }

}
