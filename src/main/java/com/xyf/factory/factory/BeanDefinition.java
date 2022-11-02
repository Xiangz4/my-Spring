package com.xyf.factory.factory;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }

}
