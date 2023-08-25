package com.telflow.quote.template;

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
    @Path("address")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    Response queryAddressSearch(@HeaderParam(TELFLOW_CORRELATION_ID) String telflowCorrelationId, String request);

    @POST
    @Path("address/{id}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    Response getAddressById(@HeaderParam(TELFLOW_CORRELATION_ID) String telflowCorrelationId, String request,
                            @PathParam("id") String id);

    @POST
    @Path("availability")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    Response performServiceQualification(@HeaderParam(TELFLOW_CORRELATION_ID) String telflowCorrelationId,
                                         String request);

}
