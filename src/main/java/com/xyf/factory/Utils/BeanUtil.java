package com.xyf.factory.Utils;

import lombok.Data;
import lombok.ToString;

import java.lang.reflect.Field;
import java.util.List;

public class BeanUtil {

    public static void setFieldValue(Object bean,String name,Object value) throws IllegalAccessException {
        Class clazz = bean instanceof Class ? (Class) bean : bean.getClass();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            if (value.getClass() == field.getType()){
                field.setAccessible(true);
                field.set(bean,value);
            }
        }

    }


}

