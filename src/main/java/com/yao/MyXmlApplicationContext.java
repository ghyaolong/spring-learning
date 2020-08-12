package com.yao;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.AbstractXmlApplicationContext;

public class MyXmlApplicationContext extends AbstractXmlApplicationContext {
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(true);
		super.customizeBeanFactory(beanFactory);
	}
}
