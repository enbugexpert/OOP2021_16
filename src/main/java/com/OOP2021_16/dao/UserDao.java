package com.OOP2021_16.dao;


import com.OOP2021_16.domain.User;

public interface UserDao extends BaseDao<User> {

    User findByUsername(String username);

}
