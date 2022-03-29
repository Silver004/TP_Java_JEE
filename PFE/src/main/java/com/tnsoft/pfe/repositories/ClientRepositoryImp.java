package com.tnsoft.pfe.repositories;
import com.tnsoft.pfe.models.Client;

public class ClientRepositoryImp implements ClientRepository{
    @Override
    public Client save(Client c){
        System.out.println("DAO layer : client repository implementation level");
        return null;
    }
}
