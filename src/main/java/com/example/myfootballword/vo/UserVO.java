package com.example.myfootballword.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserVO {

    @ApiModelProperty("用户名称")
    private String userName;

    @ApiModelProperty("用户密码")
    private String userPassword;
}
