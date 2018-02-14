package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvshealth.eccm.maintanancepanelservices.entity.Client;
import com.cvshealth.eccm.maintanancepanelservices.repository.ClientRepository;

@Service
public class ClientService implements IClientService {

  @Autowired
  private ClientRepository clientDAO;

  @Override
  public List<Client> getAllClients() {
    return clientDAO.findAll();
  }

  @Override
  public Client getClientById(Integer id) {
    Client obj = clientDAO.findOne(id);
    return obj;
  }

}
