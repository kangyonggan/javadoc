package com.kangyonggan.demo.service;

import com.kangyonggan.demo.model.User;

import java.util.List;

/**
 * 用户相关业务接口的定义
 *
 * @author kangyonggan
 * @since 6/29/17
 */
public interface UserService {

    /**
     * 分页查找用户
     *
     * @param pageNum  当前页
     * @param pageSize 每页大小
     * @return 返回指定页和大小的用户
     */
    List<User> findUsersByPage(int pageNum, int pageSize);

    /**
     * 根据用户名查找用户
     *
     * @param username 用户名
     * @return 返回查找到的用户，如果没查到就会返回null
     */
    User findUserByUsername(String username);

    /**
     * 更新用户的密码，会根据username更新。
     *
     * @param user 用户信息
     * @return 更新成功返回true，如果用户名不存在返回失败。
     */
    boolean updateUserPassword(User user);

}
