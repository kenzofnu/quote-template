package com.telflow.quote.template;

import org.eclipse.jetty.util.ajax.JSON;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

public class GenerateService extends Application implements GenerateAPI {
    @Override
    public Response ping() {
        return null;
    }

    @Override
    public JSON generateResponse(JSON request) {
        JSON response = null;
        return response;
    }


}
