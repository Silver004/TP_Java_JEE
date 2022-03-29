package com.tnsoft.pfe.controllers;

import com.tnsoft.pfe.services.ClientServiceImp;
import com.tnsoft.pfe.models.Client;

public class ClientController {
    ClientServiceImp clientService = new ClientServiceImp();
    public Client save(Client c){
        System.out.println("Client controller level");
        return clientService.save(c);
    }
}
