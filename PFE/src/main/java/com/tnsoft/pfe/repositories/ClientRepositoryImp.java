package com.tnsoft.pfe.repositories;
import com.tnsoft.pfe.models.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class ClientRepositoryImp implements ClientRepository{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();
    @Override
    public boolean save(Client c){
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

        //used to follow the chain of execution when running the program
        //System.out.println("DAO layer : client repository implementation level");
        return true;
    }
}
