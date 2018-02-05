package com.cvshealth.eccm.maintanancepanelservices.exception;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiError {

  private final List<String> errors;

  public ApiError(HttpStatus status, String message, List<String> errors) {
    super();
    this.errors = errors;
  }

  public ApiError(HttpStatus status, String message, String error) {
    super();
    errors = Arrays.asList(error);
  }
}