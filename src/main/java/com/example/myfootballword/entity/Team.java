package com.example.myfootballword.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName
@ApiModel("球队表")
public class Team {
    @TableId(value = "team_id", type = IdType.ASSIGN_ID)
    @ApiModelProperty("球队id")
    private int TeamId;

    @ApiModelProperty("球队名称")
    private String TeamName;

    @ApiModelProperty("所在联赛id")
    private int LeagueMatchId;

    @ApiModelProperty("进攻值")
    private int AttackValue;

    @ApiModelProperty("防守值")
    private int DefenseValue;
}
