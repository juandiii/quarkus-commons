package xyz.juandiii.commons.exception.mapper;

import xyz.juandiii.commons.exception.ErrorValidationException;
import xyz.juandiii.commons.utils.RestResponse;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.ArrayList;
import java.util.List;

@Provider
public class ErrorValidationExceptionMapper implements ExceptionMapper<ErrorValidationException> {
    @Override
    public Response toResponse(ErrorValidationException exception) {
        return Response.status(400)
            .entity(errorResponse(exception))
            .build();
    }

    public static JsonObject errorResponse(ErrorValidationException errorValidationException) {
        return Json.createObjectBuilder()
            .add("hasErrors", true)
            .add("code", 400)
            .add("data", Json.createObjectBuilder().build())
            .add("message", errorValidationException.getMessage())
            .add("errors", setErrors(errorValidationException.getErrors()))
            .build();
    }

    public static JsonArray setErrors(List<String> errors) {
        return Json.createArrayBuilder(new ArrayList<>(errors))
            .build();
    }
}
