package com.jcking97.dinocardgamebackend;

import java.net.URI;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.http.ProblemDetail;
import org.springframework.web.context.request.WebRequest;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ProblemDetail handleIIllegalArgumentException(IllegalArgumentException e, WebRequest request) {
        ProblemDetail problemDetail
            = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
        problemDetail.setInstance(URI.create("discount"));
        return problemDetail;
    }
}