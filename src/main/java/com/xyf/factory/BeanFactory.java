package com.xyf.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory{
    Object getBean(String beanName);
}
