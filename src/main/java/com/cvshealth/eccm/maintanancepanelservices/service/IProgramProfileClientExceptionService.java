package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import com.cvshealth.eccm.maintanancepanelservices.entity.ProgramProfileClientException;

public interface IProgramProfileClientExceptionService {

  ProgramProfileClientException addProgramProfileClientException(
      ProgramProfileClientException programProfileClientException);

  void deleteProgramProfileClientException(Integer id);

  List<ProgramProfileClientException> getAllProgramProfileClientExceptions();

  ProgramProfileClientException getProgramProfileClientExceptionById(Integer id);

  void updateProgramProfileClientException(ProgramProfileClientException programProfileClientException);

}
