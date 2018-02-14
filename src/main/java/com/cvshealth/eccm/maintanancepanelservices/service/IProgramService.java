package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import com.cvshealth.eccm.maintanancepanelservices.entity.Program;

public interface IProgramService {

  boolean addProgram(Program program);

  void deleteProgram(Integer id);

  List<Program> getAllPrograms();

  Program getProgramById(Integer id);

  void updateProgram(Program program);
}
