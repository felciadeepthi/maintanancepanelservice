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

import com.cvshealth.eccm.maintanancepanelservices.entity.Client;
import com.cvshealth.eccm.maintanancepanelservices.exception.DataNotFoundControllerException;
import com.cvshealth.eccm.maintanancepanelservices.exception.ErrorResponse;
import com.cvshealth.eccm.maintanancepanelservices.service.IClientService;

@CrossOrigin
@Controller
@RequestMapping("/api")
public class ClientController {

  @Autowired
  private IClientService clientService;

  @ExceptionHandler(DataNotFoundControllerException.class)
  public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
    ErrorResponse error = new ErrorResponse();
    error.setErrorCode(HttpStatus.NOT_FOUND.value());
    error.setMessage(ex.getMessage());
    return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
  }

  @RequestMapping(value = "/client", method = RequestMethod.GET)
  public ResponseEntity<List<Client>> getAllClients() {
    List<Client> list = clientService.getAllClients();
    return new ResponseEntity<List<Client>>(list, HttpStatus.OK);
  }

  @RequestMapping(value = "/client/{id}", method = RequestMethod.GET)
  public ResponseEntity<Client> getClientById(@PathVariable("id") Integer id) throws DataNotFoundControllerException {
    Client client = clientService.getClientById(id);
    if (client != null) {
      return new ResponseEntity<Client>(client, HttpStatus.OK);
    } else {
      throw new DataNotFoundControllerException("Client Not Found");
    }
  }
}
