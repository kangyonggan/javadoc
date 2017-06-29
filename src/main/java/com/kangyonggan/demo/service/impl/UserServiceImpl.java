package com.kangyonggan.demo.service.impl;

import com.kangyonggan.demo.model.User;
import com.kangyonggan.demo.service.UserService;

import java.util.List;

/**
 * 提供分页查询用户、按用户名查询用户、修改密码等接口
 *
 * @author kangyonggan
 * @since 6/29/17
 */
public class UserServiceImpl implements UserService {

    public List<User> findUsersByPage(int pageNum, int pageSize) {
        return null;
    }

    public User findUserByUsername(String username) {
        return null;
    }

    public boolean updateUserPassword(User user) {
        return false;
    }
}
