package at.htl.hello;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class HelloResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Welcome to my little vehicle application!";
    }
}
