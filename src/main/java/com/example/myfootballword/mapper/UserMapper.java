package com.example.myfootballword.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.myfootballword.entity.User;
import com.example.myfootballword.vo.UserVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user")
    List<User> selectAllUser();

    @Insert("insert into user values(#{user.userName},#{user.userPassword})")
    Boolean insertUser(@Param("user") User user);

    @Select("select * from user where user_name = #{username}")
    UserVO searchByUserId(@Param("username") String username);

    @Delete("delete from user where user_name = #{username}")
    Boolean deleteByUserName(@Param("username") String username);

    @Update("update user set user_password=#{userpassword} where user_name=#{username}")
    Boolean updateUserPassword(@Param("username") String username,@Param("userpassword") String userpassword);
}
