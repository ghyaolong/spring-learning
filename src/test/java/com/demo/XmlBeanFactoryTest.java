package com.demo;

import com.yao.bean.Person;
import com.yao.bean.TestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/7/13 11:39
 * @DESC
 */
public class XmlBeanFactoryTest {
    @Test
    public void testAbc() throws IOException {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        //获取bean的时候就会涉及到循环依赖的处理
        Person person = (Person) bf.getBean("person");
        person.say();
    }

    @Test
    public void testClassPathApplication(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        person.say();
    }

    @Test
    public void testAspect(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean test = (TestBean) context.getBean("test");
        test.test();
    }
}
