package com.example.myfootballword.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.myfootballword.entity.User;
import com.example.myfootballword.mapper.UserMapper;
import com.example.myfootballword.service.UserService;
import com.example.myfootballword.util.R;
import com.example.myfootballword.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
        public List<UserVO> selectUser() {
        List<User> table = baseMapper.selectAllUser();
        List<UserVO> userVOS = new ArrayList<>();
        System.out.println(table);
        table.forEach(item->{
            UserVO userVO = new UserVO();
            userVO.setUserName(item.getUserName());
            userVO.setUserPassword(item.getUserPassword());
            userVOS.add(userVO);
        });
        return userVOS;
    }

    @Override
    public boolean insertUser(User user) {
        boolean p = baseMapper.insertUser(user);
        return p;
    }

    @Override
    public UserVO selectUserById(String username) {
        UserVO userVO = baseMapper.searchByUserId(username);
        return userVO;
    }

    @Override
    public boolean deleteUser(String username) {
        boolean p = baseMapper.deleteByUserName(username);
        return p;
    }

    @Override
    public boolean updateUser(User user) {
        boolean p = baseMapper.updateUserPassword(user.getUserName(),user.getUserPassword());
        return p;
    }
}
