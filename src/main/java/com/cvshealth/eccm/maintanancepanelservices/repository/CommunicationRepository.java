package com.cvshealth.eccm.maintanancepanelservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvshealth.eccm.maintanancepanelservices.entity.Communication;

public interface CommunicationRepository extends JpaRepository<Communication, Integer> {

}
