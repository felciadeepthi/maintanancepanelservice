package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvshealth.eccm.maintanancepanelservices.entity.Program;
import com.cvshealth.eccm.maintanancepanelservices.repository.ProgramRepository;

@Service
public class ProgramService implements IProgramService {

  @Autowired
  private ProgramRepository programDAO;

  @Override
  public boolean addProgram(Program program) {
    if (programDAO.existsByName(program.getName())) {
      // logger.debug("addPerson " + person.getName() + " already Exists!");
      // TODO add logging and probably throw a custom exception like
      // DuplicateProgramException
      return false;
    } else {
      programDAO.save(program);
      return true;
    }
  }

  @Override
  public void deleteProgram(Integer id) {
    programDAO.delete(id);

  }

  @Override
  public List<Program> getAllPrograms() {
    return programDAO.findAll();
  }

  @Override
  public Program getProgramById(Integer id) {
    Program obj = programDAO.findOne(id);
    return obj;
  }

  @Override
  public void updateProgram(Program program) {
    programDAO.save(program);

  }

}
