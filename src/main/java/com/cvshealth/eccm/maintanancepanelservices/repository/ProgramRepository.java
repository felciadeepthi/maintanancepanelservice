package com.cvshealth.eccm.maintanancepanelservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cvshealth.eccm.maintanancepanelservices.entity.Program;

public interface ProgramRepository extends JpaRepository<Program, Integer> {

  @Query("SELECT CASE WHEN COUNT(p) > 0 THEN 'true' ELSE 'false' END FROM Program p WHERE p.name = ?1")
  boolean existsByName(String name);

}
