package com.yao.post;

import com.yao.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if((bean instanceof Person)){
			Person person = (Person) bean;
			person.setName("yaochenglonghahah");
			return person;
		}
		return bean;
	}
}
