package com.example.myfootballword.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PlayerVO {

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
