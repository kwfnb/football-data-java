package com.example.myfootballword.controller;

import com.example.myfootballword.entity.User;
import com.example.myfootballword.service.UserService;
import com.example.myfootballword.util.R;
import com.example.myfootballword.vo.UserVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "user",tags = "用户模块")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/selectUser")
    public R selectUser(){
        List<UserVO> userVOS = userService.selectUser();
        if (userVOS.size() == 0){
            return R.failed("查询失败");
        }
        return R.ok(userVOS,"查询成功");
    }

    @PostMapping("/insertUser")
    public R insertUser(@RequestBody User user){
        System.out.println(user);
        Boolean p = userService.insertUser(user);
        return R.ok(p,"添加成功");
    }

    @PostMapping("selectUserByName")
    public R selectUserByName(@RequestBody User user){
        UserVO userVO = userService.selectUserById(user.getUserName());
        if (userVO==null){
            return R.failed("查询失败");
        }
        return R.ok(userVO,"查询成功");
    }

    @GetMapping("deleteUserByName/{username}")
    public R deleteUserByName(@PathVariable("username") String username){
        boolean p = userService.deleteUser(username);
        if (p){
            return R.ok(p,"删除成功");
        }
            return R.failed("删除失败");
    }

    @PostMapping("updateUser")
    public R updateUser(@RequestBody User user){
        boolean p = userService.updateUser(user);
        if (p){
           return R.ok("修改成功");
        }
           return R.failed("修改失败");
    }
}
