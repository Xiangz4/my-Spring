package com.xyf.factory.support;

import com.xyf.BeansException;
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

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

//    @Override
//    public <T> Map<String,T> getBeansOfType(Class<T> type)throws BeansException{
//        Map<String,T> result = new HashMap<>();
//        beanDefinitionMap.forEach( (beanName, beanDefinition) ->{
//            Class clazz = beanDefinition.getBeanClass();
//            if (type.isAssignableFrom(clazz)){
//                result.put(beanName,(T)getBean(beanName));
//            }
//        });
//        return result;
//    }
    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named '" + beanName + "' is defined");
        return beanDefinition;
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }


}
