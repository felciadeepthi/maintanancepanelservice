package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvshealth.eccm.maintanancepanelservices.entity.ProgramConfiguration;
import com.cvshealth.eccm.maintanancepanelservices.repository.ProgramConfigurationRepository;

@Service
public class ProgramConfigurationService implements IProgramConfigurationService {

  @Autowired
  private ProgramConfigurationRepository programConfigurationDAO;

  @Override
  public ProgramConfiguration addProgramConfiguration(ProgramConfiguration programConfiguration) {
    return programConfigurationDAO.save(programConfiguration);
  }

  @Override
  public void deleteProgramConfiguration(Integer id) {
    programConfigurationDAO.delete(id);

  }

  @Override
  public List<ProgramConfiguration> getAllProgramConfigurations() {
    return programConfigurationDAO.findAll();
  }

  @Override
  public ProgramConfiguration getProgramConfigurationById(Integer id) {
    ProgramConfiguration obj = programConfigurationDAO.findOne(id);
    return obj;
  }

  @Override
  public void updateProgramConfiguration(ProgramConfiguration programConfiguration) {
    programConfigurationDAO.save(programConfiguration);

  }
}
