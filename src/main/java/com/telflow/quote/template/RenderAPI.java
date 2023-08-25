package com.telflow.quote.template;

import org.eclipse.jetty.util.ajax.JSON;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Address HTTP API
 *
 */
@Path("/render")
public interface RenderAPI {

    /**
     * Code for bad request.
     */
    String BAD_REQUEST = "LOC_400";

    /**
     * Code for server error.
     */
    String SERVER_ERROR = "LOC_500";

    @GET
    @Path("ping")
    Response ping();

    @POST
    @Path("render")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    String renderResponse(JSON request);



}