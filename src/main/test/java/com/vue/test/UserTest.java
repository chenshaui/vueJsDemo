package com.vue.test;

import com.vue.domain.User;
import com.vue.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private IUserService userService;

    @Test
    public void test() {
        /*List<User> list = userService.findAll();
        if (list != null) {
            System.out.println(list.size());
        }*/
        User user = userService.findById(1);
        if (user != null) {
            System.out.println(user);
        }
       /* user.setAge(41);
        userService.updateUser(user);*/
    }
}
