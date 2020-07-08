package com.demo.mytag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/7/8 21:59
 * @DESC
 */
public class NamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
