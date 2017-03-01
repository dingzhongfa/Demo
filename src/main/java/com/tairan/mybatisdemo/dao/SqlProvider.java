package com.tairan.mybatisdemo.dao;

import com.tairan.mybatisdemo.model.User;


/**
 * Created by hzdzf on 2016/11/21.
 */
public class SqlProvider {

    public String selectUserCheck(User user) {
        String selectStr = "select * from user where 1=1";
        if (user.getId() != null) {
            selectStr += " and id=#{id}";
        }
        if (user.getUserName() != null && user.getUserName().trim().length() > 0) {
            selectStr += " and userName=#{userName}";
        }
        if (user.getAge() != null) {
            selectStr += " and age=#{age}";
        }
        return selectStr;
    }

    public String selectAllUser() {
        return "select * from user";
    }
}
