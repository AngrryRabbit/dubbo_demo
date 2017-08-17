package com.tony.service;

import com.tony.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony on 2017/8/16.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public User getUserBySex(int sex) {
        User user = new User();
        if(sex==0){
            user.setName("zhangsan");
            user.setAge(10);
            user.setAddres("china");
        }else{
            user.setName("hanmeimei");
            user.setAge(15);
            user.setAddres("USA");
        }
        return user;
    }

    public List<User> getUsers() {
        List<User> list = new ArrayList<User>();
        for (int i = 1; i < 10; i++) {
            User user = new User();
            user.setName("zhangsan"+i);
            user.setAge(10*i);
            user.setAddres("china"+i);
            list.add(user);
        }
        return list;
    }
}
