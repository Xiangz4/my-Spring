package com.xyf.factory;

/*
    属性值，若Bean中有成员对象，完成对应成员对象属性的记录、填充
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyValue {
    private final String name;
    private final Object value;


    public PropertyValue(String name,Object value){
        this.name = name;
        this.value = value;
    }

}
