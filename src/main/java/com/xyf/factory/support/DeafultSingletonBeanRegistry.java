package com.xyf.factory.support;

import com.xyf.factory.factory.SingletonBeanRegistry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DeafultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String , Object> singletonMap = new ConcurrentHashMap<>();

    @Override
    public Object getSingletonBean(String beanName) {
        return singletonMap.get(beanName);
    }

    public void addSingleton(String beanName,Object bean){
        singletonMap.put(beanName,bean);
    }
}
