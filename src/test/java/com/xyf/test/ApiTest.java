package com.xyf.test;

import com.xyf.factory.factory.BeanDefinition;
import com.xyf.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        factory.registerBeanDefinition("userservice",beanDefinition);
        UserService bean = (UserService) factory.getBean("userservice", "xyf");
        bean.queryUserInfo();
    }

}
