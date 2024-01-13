package io.weli.resteasy.wildfly;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class FooResource {

    @Path("/ok")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String ok() {
        return "OK";
    }
}
