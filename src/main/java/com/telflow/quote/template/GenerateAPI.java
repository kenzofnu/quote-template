package com.telflow.quote.template;

import org.eclipse.jetty.util.ajax.JSON;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("api/generate")
public interface GenerateAPI {

    /**
     * Fabric header.
     */
    String TELFLOW_CORRELATION_ID = "telflowCorrelationId";

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
    @Path("generate")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    JSON generateResponse(JSON request);



}
