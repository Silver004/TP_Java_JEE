package com.tnsoft.pfe.controllers;

import com.tnsoft.pfe.services.ClientServiceImp;
import com.tnsoft.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientController {
    ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
    ClientServiceImp clientService = (ClientServiceImp) appContext.getBean("service");
    //this line is grayed because using the inversion of control allow us to prevent hard coding our classes
    //ClientServiceImp clientService = new ClientServiceImp();
    public Client save(Client c){
        System.out.println("Client controller level");
        return clientService.save(c);
    }
}
