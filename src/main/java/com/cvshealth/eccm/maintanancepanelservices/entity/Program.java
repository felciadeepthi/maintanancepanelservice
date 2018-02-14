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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", resolver = EntityIdResolver.class, scope = Program.class)
public class Program implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1571336590866311408L;

  @Id
  private int id;
  private String name;
  private String description;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "program") // @JsonIdentityReference(alwaysAsId
                                                                                       // =
                                                                                       // true)
                                                                                       // private
  Set<ProgramProfile> programProfile;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "program")

  @JsonIdentityReference(alwaysAsId = true)
  private Set<ProgramProfileClientException> programProfileClientException;
  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "program")

  @JsonIdentityReference(alwaysAsId = true)
  private Set<ProgramConfiguration> programConfiguration;

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

  public Set<ProgramProfile> getProgramProfile() {
    return programProfile;
  }

  public Set<ProgramProfileClientException> getProgramProfileClientException() {
    return programProfileClientException;
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

  public void setProgramProfile(Set<ProgramProfile> programProfile) {
    this.programProfile = programProfile;
  }

  public void setProgramProfileClientException(Set<ProgramProfileClientException> programProfileClientException) {
    this.programProfileClientException = programProfileClientException;
  }

}
