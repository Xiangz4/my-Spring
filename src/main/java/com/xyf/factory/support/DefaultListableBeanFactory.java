package com.xyf.factory.support;

import com.xyf.factory.factory.BeanDefinition;
import com.xyf.factory.support.AbstractAutowireCapableBeanFactory;
import com.xyf.factory.support.BeanDefinitionRegisty;

import java.util.HashMap;
import java.util.Map;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegisty {
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        BeanDefinition put = beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeandefinition(String beanName) {
        return beanDefinitionMap.get(beanName);
    }


}
