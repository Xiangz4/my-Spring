package com.xyf.test;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    private static Map<String,String> map = new HashMap<>();

    static {
        map.put("xyf","21");
    }

    public String queryUserName(String uId){
        return map.get(uId);
    }
}
