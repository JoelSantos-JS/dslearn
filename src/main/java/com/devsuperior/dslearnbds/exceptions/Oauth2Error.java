package com.devsuperior.dslearnbds.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Oauth2Error implements Serializable {

    private String error;
    @JsonProperty("error_description")
    private String errorDescription;

    public Oauth2Error() {
    }

    public Oauth2Error(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;

    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

}
