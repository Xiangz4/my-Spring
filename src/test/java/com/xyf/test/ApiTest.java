package com.xyf.test;

import com.xyf.factory.factory.BeanDefinition;
import com.xyf.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

public class ApiTest {
    @Test
    public void test(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        factory.registerBeanDefinition("userService", beanDefinition);
        UserService userService = (UserService) factory.getBean("userService");
        userService.queryUserInfo();

        UserService user_singlton = (UserService) factory.getSingletonBean("userService");
        user_singlton.queryUserInfo();
    }

}
