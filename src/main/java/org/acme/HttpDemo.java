package org.acme;

import jakarta.ws.rs.*;
import org.jboss.resteasy.reactive.RestHeader;
import org.jboss.resteasy.reactive.RestQuery;

@Path("/http")
public class HttpDemo {
    @GET
    @Path("/{name}")
    public String get(String name) {
        return name;
    }

    @POST
    public ResponseBody post(RequestBody body) {
        return new ResponseBody(body.name(), body.age());
    }

    @PUT
    public void put() {
    }

    @PATCH
    public void patch(@RestHeader("X-Header") String header) {
        System.out.println(header);
    }

    @DELETE
    public void delete(@RestQuery int age) {
        System.out.println(age);
    }
}
