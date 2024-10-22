package br.com.udemy.rafael.unittest.api.service.exceptions;

import java.io.Serial;

public class DataIntegrateViolationException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public DataIntegrateViolationException(String message) {
        super(message);
    }
}
