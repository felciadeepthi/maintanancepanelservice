package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import com.cvshealth.eccm.maintanancepanelservices.entity.ProgramConfiguration;

public interface IProgramConfigurationService {

  ProgramConfiguration addProgramConfiguration(ProgramConfiguration programConfiguration);

  void deleteProgramConfiguration(Integer id);

  List<ProgramConfiguration> getAllProgramConfigurations();

  ProgramConfiguration getProgramConfigurationById(Integer id);

  void updateProgramConfiguration(ProgramConfiguration programConfiguration);

}
