package com.tairan.mybatisdemo.service;

import com.tairan.mybatisdemo.model.User;
import com.tairan.mybatisdemo.model.bill_transfer_guarantee;

import java.util.List;

/**
 * Created by hzdzf on 2016/11/14.
 */
public interface UserService {

    List<User> getUser();

    List<User> selectUserCheck(User user);

    int insert(User user);

    int delete(int id);

    int update(User user);

    /**
     * 通过id查询
     * @param id
     * @return
     */
    User getById(int id);

    List<bill_transfer_guarantee> selectAll();
}
