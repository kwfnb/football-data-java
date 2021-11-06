package com.example.myfootballword.service;

import com.example.myfootballword.entity.User;
import com.example.myfootballword.vo.UserVO;

import java.util.List;

public interface UserService {

    List<UserVO> selectUser();

    boolean insertUser(User user);

    UserVO selectUserById(String username);

    boolean deleteUser(String username);

    boolean updateUser(User user);
}
