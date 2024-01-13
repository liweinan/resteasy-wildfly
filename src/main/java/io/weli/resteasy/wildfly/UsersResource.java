package io.weli.resteasy.wildfly;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
public class UsersResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Integer page(@QueryParam("paging") Integer page) {
        return page;
    }
}
