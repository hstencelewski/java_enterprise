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

import com.example.restwsdemo.domain.Code;
import com.example.restwsdemo.service.CodeManager;

@Path("code")
@Stateless
public class CodeRESTService {

    @Inject
    private CodeManager mm;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Code> getArtist() {
        return mm.getAllCodes();
    }

    @GET
    @Path("/{codeId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Code getSongArtist(@PathParam("codeId") Integer id) {
        Code c = mm.getCode(id);
        return c;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addSongArtist(Code code) {
        mm.addCode(code);

        return Response.status(201).entity("Success").build();
    }

    @DELETE
    public Response clearArtists() {
        return Response.status(200).build();
    }

}
