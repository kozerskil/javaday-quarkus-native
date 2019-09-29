package org.acme;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting hello() {
        return Greeting.builder()
            .id(UUID.randomUUID().toString())
            .content("Greetings from Quarkus!")
            .build();
    }
}
