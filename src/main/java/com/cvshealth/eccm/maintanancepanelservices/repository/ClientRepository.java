package com.cvshealth.eccm.maintanancepanelservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvshealth.eccm.maintanancepanelservices.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
