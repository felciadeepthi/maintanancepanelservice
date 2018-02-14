package com.cvshealth.eccm.maintanancepanelservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvshealth.eccm.maintanancepanelservices.entity.ClientConfiguration;

public interface ClientConfigurationRepository extends JpaRepository<ClientConfiguration, Integer> {

}
