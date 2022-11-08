package com.xyf.factory.factory;

public class BeanReference {
    private String name;
    public BeanReference(String name){
        this.name = name;
    }
    public  String getBeanName(){
        return name;
    }

}
