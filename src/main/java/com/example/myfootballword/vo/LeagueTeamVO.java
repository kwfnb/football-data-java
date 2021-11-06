package com.example.myfootballword.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class LeagueTeamVO {
    @ApiModelProperty("联赛名")
    private String LeagueMatchName;

    private List<TeamVO> teamList;


}
