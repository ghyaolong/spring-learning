package com.demo.mytag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author yaochenglong
 * @version V1.0
 * @date 2020/7/8 22:01
 * @DESC
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");
        String id = element.getAttribute("id");

        if (StringUtils.hasText(id)) {
            //bean.addPropertyValue:把属性值放到bean中
            builder.addPropertyValue("id", id);
        }
        if (StringUtils.hasText(name)) {
            builder.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(age)) {
            builder.addPropertyValue("age", Integer.valueOf(age));
        }
    }
}
