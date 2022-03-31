package com.tnsoft.pfe;

import com.tnsoft.pfe.controllers.ClientController;
import com.tnsoft.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
    public static void main(String[] args){
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl1 = (ClientController) appContext.getBean("controller");
        //ClientController ctrl1 = new ClientController();
        Client client = new Client(1,"Linus");
        ctrl1.save(client);
    }
}
