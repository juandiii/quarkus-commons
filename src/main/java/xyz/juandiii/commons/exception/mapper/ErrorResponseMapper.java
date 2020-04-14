package xyz.juandiii.commons.exception.mapper;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import xyz.juandiii.commons.exception.ServiceException;

@Provider
public class ErrorResponseMapper implements ExceptionMapper<ServiceException> {

	@Override
	public Response toResponse(ServiceException exception) {

        int code = exception.getStatusCode();

        switch(code) {
            case 400:
                return Response.status(400)
                    .entity(errorObject(exception.getMessage(), code))
                    .build();
            case 401:
                    return Response.status(401)
                        .entity(errorObject(exception.getMessage(), code))
                        .build();
            case 404:
                return Response.status(404)
                    .entity(errorObject(exception.getMessage(), code))
                    .build();
            case 500:
                return Response.status(500)
                    .entity(errorObject("Internal error", code))
                    .build();
            default:
                return Response.serverError().build();
        }
    }


    public JsonObject errorObject(String message, int code) {
        return Json.createObjectBuilder()
            .add("hasErrors", true)
            .add("code", code)
            .add("message", message)
            .build();
    }

}