package com.devsuperior.dslearnbds.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.dslearnbds.services.exceptions.ForbidenException;
import com.devsuperior.dslearnbds.services.exceptions.UnauthorizedException;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(EnityNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(EnityNotFoundException e, HttpServletRequest request) {
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setError("Resource not found");
        err.setMessage(e.getMessage());
        err.setPath(request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErro> validation(MethodArgumentNotValidException e, HttpServletRequest request) {
        ValidationErro err = new ValidationErro();
        err.setTimestamp(Instant.now());
        err.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
        err.setError("Resource not found");
        err.setMessage(e.getMessage());
        err.setPath(request.getRequestURI());

        for (FieldError fieldError : e.getBindingResult().getFieldErrors()) {
            err.addError(fieldError.getField(), fieldError.getDefaultMessage());

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    @ExceptionHandler(ForbidenException.class)
    public ResponseEntity<Oauth2Error> entityNotFound(ForbidenException e, HttpServletRequest request) {
        Oauth2Error err = new Oauth2Error();
        err.setError("FORBIDEN");
        err.setErrorDescription(e.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<Oauth2Error> unathorized(UnauthorizedException e, HttpServletRequest request) {
        Oauth2Error err = new Oauth2Error();
        err.setError("UnauthorizedException");
        err.setErrorDescription(e.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

}