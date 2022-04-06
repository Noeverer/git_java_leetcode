package com.kuang.dao;


import com.kuang.pojo.User;
import java.util.List;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();
    //根据id查询用户
    User getUserId(int i);
    //添加用户
    int addUser(User user);
    //更新用户
    int updateUser(User user);

    int deleteUser(User user);
}
