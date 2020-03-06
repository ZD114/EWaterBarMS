package com.etc.dao;

import com.etc.entity.User;

import java.util.List;

public interface UserDao {

    //查询所有用户
    public List<User> queryUser(User u);

    //根据用户号删除用户
    public void delUser(Integer userId);
}
