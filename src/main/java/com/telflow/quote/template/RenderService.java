package com.telflow.quote.template;

import org.eclipse.jetty.util.ajax.JSON;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import java.security.Key;

public class RenderService extends Application implements RenderAPI {
    @Override
    public Response ping() {
        return null;
    }

    @Override
    public String renderResponse(JSON request) {
        String response=JSON.toString(request);
        return response;
    }


};

