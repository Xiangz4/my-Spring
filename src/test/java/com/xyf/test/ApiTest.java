package com.xyf.test;

import com.xyf.BeansException;
import com.xyf.factory.PropertyValue;
import com.xyf.factory.PropertyValues;
import com.xyf.factory.XML.XmlBeanReader;
import com.xyf.factory.factory.BeanDefinition;
import com.xyf.factory.factory.BeanReference;
import com.xyf.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

public class ApiTest {
    @Test
    public void test() throws BeansException {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanReader reader = new XmlBeanReader(factory);
        reader.LoadBeanDef("classpath:spring.xml");

        UserService userService = (UserService) factory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("结果是"+result);

    }

}
