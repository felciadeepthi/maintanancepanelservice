package com.cvshealth.eccm.maintanancepanelservices.service;

import java.util.List;

import com.cvshealth.eccm.maintanancepanelservices.entity.Client;



public interface IClientService {
	
	Client getClientById(Integer id);
	
	List<Client> getAllClients();
}
