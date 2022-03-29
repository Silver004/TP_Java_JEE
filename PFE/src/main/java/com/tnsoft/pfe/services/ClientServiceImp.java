package com.tnsoft.pfe.services;

import com.tnsoft.pfe.models.Client;

import com.tnsoft.pfe.repositories.ClientRepositoryImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientServiceImp implements ClientService{
    ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
    ClientRepositoryImp clientRepository = (ClientRepositoryImp) appContext.getBean("dao");
    //ClientRepositoryImp clientRepository = new ClientRepositoryImp();

    @Override
    public Client save(Client c){
        System.out.println("Service layer : Client service implementation layer");
        return clientRepository.save(c);
    }
}
