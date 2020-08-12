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
        //此处第一个参数elementName对应自定义xsd文件中
        //<xsd:element name="user">
        //标签中name的值，必须对应起来，不然启动会报错：Cannot locate BeanDefinitionParser for element [user]
        //spring是通过解析自定义标签命名空间来找对应的命名空间处理器
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
