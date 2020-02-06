package com.vue.service;

import com.vue.domain.User;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface IUserService {
    /**
     * 查询用户列表
     */
    List<User> findAll();

    /**
     * 根据id查询
     * @param id
     * @return User
     */
    User findById(Integer id);

    /**
     * 更新用户信息
     * @param user
     */
    void updateUser(User user);
}
