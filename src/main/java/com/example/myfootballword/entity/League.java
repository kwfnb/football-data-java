package com.example.myfootballword.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName
@ApiModel("联赛表")
public class League {
    @TableId(value = "league_match_id", type = IdType.ASSIGN_ID)
    @ApiModelProperty("联赛id")
    private int LeagueMatchId;

    @ApiModelProperty("联赛名")
    private String LeagueMatchName;

    @ApiModelProperty("联赛级别")
    private String LeagueLevel;

    @ApiModelProperty("联赛洲际名额")
    private int LntercontinentalQuota;


}
