package com.example.myfootballword.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LeagueVO {
    @ApiModelProperty("联赛id")
    private int LeagueMatchId;

    @ApiModelProperty("联赛名")
    private String LeagueMatchName;

    @ApiModelProperty("联赛级别")
    private String LeagueLevel;

    @ApiModelProperty("联赛洲际名额")
    private int LntercontinentalQuota;
}
