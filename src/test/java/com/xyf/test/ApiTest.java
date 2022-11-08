package com.xyf.test;

import com.xyf.factory.PropertyValue;
import com.xyf.factory.PropertyValues;
import com.xyf.factory.factory.BeanDefinition;
import com.xyf.factory.factory.BeanReference;
import com.xyf.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import org.springframework.context.annotation.Bean;

public class ApiTest {
    @Test
    public void test(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        factory.registerBeanDefinition("userDao",new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "xyf"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        factory.registerBeanDefinition("userService",beanDefinition);

        UserService userService = (UserService) factory.getBean("userService");
        userService.queryUserInfo();
    }

}
