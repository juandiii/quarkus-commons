package xyz.juandiii.commons.utils;

import javax.ws.rs.core.Response;

public abstract class Controller {

    protected <T> Response successResponse(T object, String message, boolean hasErrors, int code) {
        return Response.status(code)
            .entity(RestResponse.toResponse(object, message, hasErrors, code))
            .build();
    }

}