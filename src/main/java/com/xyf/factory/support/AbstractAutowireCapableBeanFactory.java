package com.xyf.factory.support;

import com.xyf.factory.factory.BeanDefinition;

import java.lang.reflect.Constructor;

/*
    实例化Bean类
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    private InstantiationStrategy instantiationStrategy = new SimpleInstantiationStrategy();

    @Override
    protected Object createBean(String BeanName, BeanDefinition beanDefinition, Object[] args) {
        Object bean = null;
        try {
            bean = createBeanInstance(beanDefinition,BeanName,args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        addSingleton(BeanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructorToUse = null;
        Class clazz = beanDefinition.getBeanClass();
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            if (null != args && constructor.getParameterTypes().length == args.length){
                constructorToUse = constructor;
            }
        }

        return instantiationStrategy.instantiate(beanDefinition,beanName,constructorToUse,args);
    }


}
