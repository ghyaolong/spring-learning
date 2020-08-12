package com.yao.post;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			if("person".equals(beanDefinitionName)){
				BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
				beanDefinition.setAttribute("name","yaochenglong");
				beanDefinition.setAttribute("age",90);
			}
			System.out.println("----------"+beanDefinitionName);
		}
	}
}
