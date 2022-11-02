package com.xyf.factory.support;

import com.xyf.factory.factory.BeanDefinition;

/*
    实例化Bean类
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String BeanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        addSingleton(BeanName,bean);
        return bean;
    }
}
