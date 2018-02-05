package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvshealth.eccm.maintanancepanelservices.entity.Communication;
import com.cvshealth.eccm.maintanancepanelservices.repository.CommunicationRepository;

@Service
public class CommunicationService implements ICommunicationService {

  @Autowired
  private CommunicationRepository communicationDao;

  @Override
  public List<Communication> getAllCommunications() {
    return communicationDao.findAll();
  }

  @Override
  public Communication getCommunicationById(Integer id) {
    Communication obj = communicationDao.findOne(id);
    return obj;
  }

}
