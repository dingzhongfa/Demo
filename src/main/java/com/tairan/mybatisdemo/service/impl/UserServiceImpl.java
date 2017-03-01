package com.tairan.mybatisdemo.service.impl;

import com.tairan.mybatisdemo.dao.UserMapper;
import com.tairan.mybatisdemo.dao.bill_transfer_guaranteeMapper;
import com.tairan.mybatisdemo.model.User;
import com.tairan.mybatisdemo.model.bill_transfer_guarantee;
import com.tairan.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hzdzf on 2016/11/14.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;

    @Autowired
    private bill_transfer_guaranteeMapper bDao;


    /*@Override
    public User getUserById(int userId) {
        return null;
    }*/


    @Override
    public List<User> getUser() {
        return this.userDao.select();
    }

    @Override
    public List<User> selectUserCheck(User user) {
        return userDao.combine(user);
    }

    @Override
    public int insert(User user) {
        this.userDao.insert(user);
        return user.getId();
    }



    @Override
    public int delete(int id) {
        this.userDao.deleteByPrimaryKey(id);
        return id;
    }

    @Override
    public int update(User user) {
        this.userDao.updateByPrimaryKey(user);
        return user.getId();
    }

    @Override
    public User getById(int id) {
        return this.userDao.selectById(id);

    }

    @Override
    public List<bill_transfer_guarantee> selectAll() {
        return bDao.selectAll();
    }
}
