package com.cvshealth.eccm.maintanancepanelservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cvshealth.eccm.maintanancepanelservices.entity.Communication;
import com.cvshealth.eccm.maintanancepanelservices.exception.CommunicationControllerException;
import com.cvshealth.eccm.maintanancepanelservices.exception.ErrorResponse;
import com.cvshealth.eccm.maintanancepanelservices.service.ICommunicationService;

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/cors.html
@CrossOrigin
@Controller
@RequestMapping("/api")
public class CommunicationController {

  @Autowired
  private ICommunicationService communicationService;

  @ExceptionHandler(CommunicationControllerException.class)
  public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
    ErrorResponse error = new ErrorResponse();
    error.setErrorCode(HttpStatus.NOT_FOUND.value());
    error.setMessage(ex.getMessage());
    return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
  }

  @RequestMapping(value = "/communication", method = RequestMethod.GET)
  public ResponseEntity<List<Communication>> getAllCommunications() {
    List<Communication> list = communicationService.getAllCommunications();
    return new ResponseEntity<List<Communication>>(list, HttpStatus.OK);
  }

  @RequestMapping(value = "/communication/{id}", method = RequestMethod.GET)
  public ResponseEntity<Communication> getCommunicationById(@PathVariable("id") Integer id)
      throws CommunicationControllerException {
    Communication communication;
    communication = communicationService.getCommunicationById(id);
    if (communication != null) {
      return new ResponseEntity<Communication>(communication, HttpStatus.OK);
    } else {
      throw new CommunicationControllerException("Communication Not Found");
    }

  }
}
