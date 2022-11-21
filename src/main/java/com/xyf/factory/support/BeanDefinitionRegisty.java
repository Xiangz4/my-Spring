package com.xyf.factory.support;

import com.xyf.BeansException;
import com.xyf.factory.factory.BeanDefinition;

public interface BeanDefinitionRegisty {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /*
        06-文件配置读取
     */
    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;


    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();
}
