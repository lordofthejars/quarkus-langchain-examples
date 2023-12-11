package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    Assistant assistant;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return assistant.chat("Can you explain me why earth is flat?");
    }
}
