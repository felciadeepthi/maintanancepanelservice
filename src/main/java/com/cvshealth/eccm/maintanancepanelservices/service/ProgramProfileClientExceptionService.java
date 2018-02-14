package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvshealth.eccm.maintanancepanelservices.entity.ProgramProfileClientException;
import com.cvshealth.eccm.maintanancepanelservices.repository.ProgramProfileClientExceptionRepository;

@Service
public class ProgramProfileClientExceptionService implements IProgramProfileClientExceptionService {

  @Autowired
  private ProgramProfileClientExceptionRepository programProfileClientExceptionDAO;

  @Override
  public ProgramProfileClientException addProgramProfileClientException(
      ProgramProfileClientException programProfileClientException) {
    return programProfileClientExceptionDAO.save(programProfileClientException);
  }

  @Override
  public void deleteProgramProfileClientException(Integer id) {
    programProfileClientExceptionDAO.delete(id);

  }

  @Override
  public List<ProgramProfileClientException> getAllProgramProfileClientExceptions() {
    return programProfileClientExceptionDAO.findAll();
  }

  @Override
  public ProgramProfileClientException getProgramProfileClientExceptionById(Integer id) {
    ProgramProfileClientException obj = programProfileClientExceptionDAO.findOne(id);
    return obj;
  }

  @Override
  public void updateProgramProfileClientException(ProgramProfileClientException programProfileClientException) {
    programProfileClientExceptionDAO.save(programProfileClientException);

  }
}
