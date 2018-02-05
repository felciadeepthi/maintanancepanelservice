package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import com.cvshealth.eccm.maintanancepanelservices.entity.Communication;

public interface ICommunicationService {

  List<Communication> getAllCommunications();

  Communication getCommunicationById(Integer id);
}
