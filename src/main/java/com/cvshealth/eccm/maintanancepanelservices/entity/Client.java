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
// @JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,
// property="id", scope = Program.class)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", resolver = EntityIdResolver.class, scope = Client.class)
public class Client implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = -3435002475914858470L;

  @Id
  private int id;
  private String code;
  private String name;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "client")

  @JsonIdentityReference(alwaysAsId = true)
  private Set<ProgramProfileClientException> programProfileClientException;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "client")

  @JsonIdentityReference(alwaysAsId = true)
  private Set<ClientConfiguration> clientConfiguration;

  public Set<ClientConfiguration> getClientConfiguration() {
    return clientConfiguration;
  }

  public String getCode() {
    return code;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Set<ProgramProfileClientException> getProgramProfileClientException() {
    return programProfileClientException;
  }

  public void setClientConfiguration(Set<ClientConfiguration> clientConfiguration) {
    this.clientConfiguration = clientConfiguration;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setProgramProfileClientException(Set<ProgramProfileClientException> programProfileClientException) {
    this.programProfileClientException = programProfileClientException;
  }
}
