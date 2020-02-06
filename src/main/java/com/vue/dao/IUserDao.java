package com.vue.dao;

import com.vue.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IUserDao {

    /**
     * 查询用户列表
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据id查询
     * @param id
     * @return User
     */
    @Select("select * from user where id = #{id}")
    User findById(Integer id);

    /**
     * 更新用户信息
     * @param user
     */
    @Update("update user set username = #{username}, password = #{password}, age = #{age}, sex = #{sex}, email = #{email} where id = #{id}")
    void updateUser(User user);
}
