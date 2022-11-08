package com.xyf.test;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserService {
    public String uId;
    public UserDao userDao;

    public void queryUserInfo(){
        System.out.println("查询信息"+userDao.queryUserName(uId));
    }

}
