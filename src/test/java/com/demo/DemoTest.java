package com.demo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author yaochenglong
 * @version 1.0
 * @Description: TODO
 * @date 2020/6/11 17:34
 */
public class DemoTest {
    @Test
    public void test() {
        Person p =new Person();
        System.out.println(p.say());
    }

    @Test
    public void test1() {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person p = (Person) ctx.getBean("person", Person.class);
//        System.out.println(p.say());
        BeanFactory bf =  new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Person person = (Person) bf.getBean("person");
        Assert.assertEquals("abc",person.say());
    }
}
