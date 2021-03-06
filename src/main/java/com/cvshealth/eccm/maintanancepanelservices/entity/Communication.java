package com.cvshealth.eccm.maintanancepanelservices.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Communication.class)
public class Communication implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -8425884888221667448L;

  @Id
  private int id;
  private String name;
  private String description;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "communication")
  @JsonIdentityReference(alwaysAsId = true)
  private Set<ProgramConfiguration> programConfiguration;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "communication")
  @JsonIdentityReference(alwaysAsId = true)
  private Set<ClientConfiguration> clientConfiguration;

  public Set<ClientConfiguration> getClientConfiguration() {
    return clientConfiguration;
  }

  public String getDescription() {
    return description;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Set<ProgramConfiguration> getProgramConfiguration() {
    return programConfiguration;
  }

  public void setClientConfiguration(Set<ClientConfiguration> clientConfiguration) {
    this.clientConfiguration = clientConfiguration;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setProgramConfiguration(Set<ProgramConfiguration> programConfiguration) {
    this.programConfiguration = programConfiguration;
  }

}
