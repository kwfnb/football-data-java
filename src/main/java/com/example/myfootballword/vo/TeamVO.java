package com.example.myfootballword.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeamVO {

    @ApiModelProperty("球队名称")
    private String TeamName;

    @ApiModelProperty("进攻值")
    private int AttackValue;

    @ApiModelProperty("防守值")
    private int DefenseValue;
}
