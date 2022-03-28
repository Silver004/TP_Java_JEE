package com.education.spring.ioc;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSpringIocBeanFactory {
    //Unlike application context that load beans on startup, bean factory load s beans on demand
    final Resource resource = new ClassPathResource("spring.xml");
    final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    final XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);

    //To be continued, get errors when using bean factory
}
