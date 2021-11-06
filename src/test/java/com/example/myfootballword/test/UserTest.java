package com.example.myfootballword.test;

import com.example.myfootballword.service.UserService;
import com.example.myfootballword.vo.UserVO;
import com.example.myfootballword.entity.User;
import org.apache.catalina.mbeans.UserMBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void UserSelect(){
       List<UserVO> user =  userService.selectUser();

    }

    @Test
    public void UserInsert(){
        User user = new User();
        user.setUserName("刘泽强");
        user.setUserPassword("1068000");
        boolean p = userService.insertUser(user);
    }

    @Test
    public void TextUserId(){
        UserVO userVO = userService.selectUserById("admin");
        System.out.println(userVO);

    }

    @Test
    public void TextDelUserId(){
        boolean p = userService.deleteUser("String");
        System.out.println(p);
    }

    @Test
    public void TextUpdateUser(){
        User user = new User();
        user.setUserName("kwf");
        user.setUserPassword("555555");
        boolean p = userService.updateUser(user);
        System.out.println(p);
    }
}
