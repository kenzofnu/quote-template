package com.telflow.quote.template;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

public class GenerateService extends Application implements RenderAPI {
    @Override
    public Response ping() {
        return null;
    }

    @Override
    public Response queryAddressSearch(String telflowCorrelationId, String request) {
        return null;
    }

    @Override
    public Response getAddressById(String telflowCorrelationId, String request, String id) {
        return null;
    }

    @Override
    public Response performServiceQualification(String telflowCorrelationId, String request) {
        return null;
    }
}
