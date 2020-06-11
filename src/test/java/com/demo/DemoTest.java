package com.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p = (Person) ctx.getBean("person", Person.class);
        System.out.println(p.say());
    }
}
