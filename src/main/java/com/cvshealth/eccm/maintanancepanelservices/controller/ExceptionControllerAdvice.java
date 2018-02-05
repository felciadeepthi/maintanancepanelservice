package com.cvshealth.eccm.maintanancepanelservices.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cvshealth.eccm.maintanancepanelservices.exception.ErrorResponse;

//unexpected exception in our application other than the custom exception will be handled by this class
@ControllerAdvice
public class ExceptionControllerAdvice {

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
    ErrorResponse error = new ErrorResponse();
    error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
    error.setMessage("Please contact your administrator");
    return new ResponseEntity<ErrorResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
  }

}
