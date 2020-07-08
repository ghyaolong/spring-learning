package com.demo;

import com.demo.mytag.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/6/30 17:25
 * @DESC
 */
public class TestSpring {

    @Test
    public void testA(){
        XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Person person = (Person) beanFactory.getBean("person");
        person.say();
    }

    @Test
    public void testB(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        User user = (User)ctx.getBean("octonauts");
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}
