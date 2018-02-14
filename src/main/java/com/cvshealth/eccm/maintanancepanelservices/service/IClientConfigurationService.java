package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import com.cvshealth.eccm.maintanancepanelservices.entity.ClientConfiguration;

public interface IClientConfigurationService {

  ClientConfiguration addClientConfiguration(ClientConfiguration programConfiguration);

  void deleteClientConfiguration(Integer id);

  List<ClientConfiguration> getAllClientConfigurations();

  ClientConfiguration getClientConfigurationById(Integer id);

  void updateClientConfiguration(ClientConfiguration programConfiguration);
}
