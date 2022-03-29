package com.tnsoft.pfe.services;

import com.tnsoft.pfe.models.Client;
import com.tnsoft.pfe.repositories.ClientRepository;
import com.tnsoft.pfe.repositories.ClientRepositoryImp;

public class ClientServiceImp implements ClientService{
    ClientRepositoryImp clientRepository = new ClientRepositoryImp();

    @Override
    public Client save(Client c){
        System.out.println("Service layer : Client service implementation layer");
        return clientRepository.save(c);
    }
}
