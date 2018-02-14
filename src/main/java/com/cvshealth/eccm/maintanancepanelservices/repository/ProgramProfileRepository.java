package com.cvshealth.eccm.maintanancepanelservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvshealth.eccm.maintanancepanelservices.entity.ProgramProfile;

public interface ProgramProfileRepository extends JpaRepository<ProgramProfile, Integer> {

}
