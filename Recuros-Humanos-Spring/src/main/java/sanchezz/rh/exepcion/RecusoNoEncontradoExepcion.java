package sanchezz.rh.exepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecusoNoEncontradoExepcion extends RuntimeException{
    public RecusoNoEncontradoExepcion(String mensaje) {
        super(mensaje);
    }
}
