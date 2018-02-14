package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvshealth.eccm.maintanancepanelservices.entity.ClientConfiguration;
import com.cvshealth.eccm.maintanancepanelservices.repository.ClientConfigurationRepository;

@Service
public class ClientConfigurationService implements IClientConfigurationService {

  @Autowired
  private ClientConfigurationRepository clientConfigurationDAO;

  @Override
  public ClientConfiguration addClientConfiguration(ClientConfiguration clientConfiguration) {
    return clientConfigurationDAO.save(clientConfiguration);
  }

  @Override
  public void deleteClientConfiguration(Integer id) {
    clientConfigurationDAO.delete(id);

  }

  @Override
  public List<ClientConfiguration> getAllClientConfigurations() {
    return clientConfigurationDAO.findAll();
  }

  @Override
  public ClientConfiguration getClientConfigurationById(Integer id) {
    ClientConfiguration obj = clientConfigurationDAO.findOne(id);
    return obj;
  }

  @Override
  public void updateClientConfiguration(ClientConfiguration clientConfiguration) {
    clientConfigurationDAO.save(clientConfiguration);

  }
}
