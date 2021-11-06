package com.example.myfootballword.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName
@ApiModel("用户表")
public class User {
    @TableId(value = "user_name", type = IdType.ASSIGN_ID)
    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPassword;

}
