package com.xyf.factory.support;

import com.xyf.factory.factory.BeanDefinition;
import com.xyf.factory.BeanFactory;

public abstract class AbstractBeanFactory extends DeafultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        Object singletonBean = getSingletonBean(beanName);
        if (null != singletonBean){
            return singletonBean;
        }
        BeanDefinition beandefinition = getBeandefinition(beanName);
        return createBean(beanName,beandefinition);
    }

    protected abstract BeanDefinition getBeandefinition(String beanName);

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition);
}
