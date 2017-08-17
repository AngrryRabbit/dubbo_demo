package com.tony.service;

import com.tony.pojo.User;

import java.util.List;

/**
 * Created by tony on 2017/8/16.
 */
public interface UserService {

    User getUserBySex(int sex);

    List<User> getUsers();

}
