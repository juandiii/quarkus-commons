package xyz.juandiii.commons.reactive;

import xyz.juandiii.commons.utils.Controller;

import javax.ws.rs.core.Response;
import java.util.function.Function;

public abstract class ReactiveController extends Controller {

    protected <T> Function<? super T, ? extends Response> reactiveSuccess(String message, Integer code) {
        return o ->
            o != null ? successResponse(o, message, false, code) : successResponse(null, message, true, 404);
    }
}
