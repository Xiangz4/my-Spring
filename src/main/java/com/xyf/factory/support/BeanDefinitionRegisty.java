package com.xyf.factory.support;

import com.xyf.factory.factory.BeanDefinition;

public interface BeanDefinitionRegisty {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
