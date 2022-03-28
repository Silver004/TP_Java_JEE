package com.education.spring.ioc;
import com.education.tp3.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIocApplicationContext {
    public static void main(String[] args){
        //the constructor for the client class was used when setting the path for the application context (beans load at startup)
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
        Client c = (Client) appContext.getBean("clt");
        System.out.println(c.getId());
        System.out.println(c.getName());

        //after changing the scope to prototype in the bean the constructor is called the number appContext is used
        //Client c1 = (Client) appContext.getBean("clt");
    }
}
