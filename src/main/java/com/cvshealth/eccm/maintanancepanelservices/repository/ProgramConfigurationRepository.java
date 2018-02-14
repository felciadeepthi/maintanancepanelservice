package com.cvshealth.eccm.maintanancepanelservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cvshealth.eccm.maintanancepanelservices.entity.ProgramConfiguration;

public interface ProgramConfigurationRepository extends JpaRepository<ProgramConfiguration, Integer> {

  @Query("SELECT CASE WHEN COUNT(pc) > 0 THEN 'true' ELSE 'false' END FROM ProgramConfiguration pc WHERE pc.name = ?1")
  boolean existsByName(String name);

}
