package com.example.myfootballword.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName
@ApiModel("球员表")
public class Player {
    @TableId(value = "player_id", type = IdType.ASSIGN_ID)
    @ApiModelProperty("球员id")
    private int PlayerId;

    @ApiModelProperty("球员名")
    private String PlayerName;

    @ApiModelProperty("球员年龄")
    private int PlayerAge;

    @ApiModelProperty("球员能力值")
    private int PlayerValue;

    @ApiModelProperty("所属球队id")
    private int TeamId;
}
