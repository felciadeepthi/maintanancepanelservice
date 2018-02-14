package com.cvshealth.eccm.maintanancepanelservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvshealth.eccm.maintanancepanelservices.entity.ProgramProfileClientException;

public interface ProgramProfileClientExceptionRepository extends JpaRepository<ProgramProfileClientException, Integer> {

}
