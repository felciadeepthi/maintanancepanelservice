package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import com.cvshealth.eccm.maintanancepanelservices.entity.ProgramProfile;

public interface IProgramProfileService {

  ProgramProfile addProgramProfile(ProgramProfile programProfile);

  void deleteProgramProfile(Integer id);

  List<ProgramProfile> getAllProgramProfiles();

  ProgramProfile getProgramProfileById(Integer id);

  void updateProgramProfile(ProgramProfile programProfile);

}
