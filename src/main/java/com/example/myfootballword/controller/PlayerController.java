package com.example.myfootballword.controller;

import com.example.myfootballword.entity.Player;
import com.example.myfootballword.service.LeagueService;
import com.example.myfootballword.service.PlayerService;
import com.example.myfootballword.util.R;
import com.example.myfootballword.vo.LeagueVO;
import com.example.myfootballword.vo.PlayerVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
@Api(value = "player",tags = "球员模块")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/selectAll")
    public R selectAll(){
        List<PlayerVO> PlayerVOS = playerService.selectPlayer();
        if(PlayerVOS.size() == 0){
            return R.failed("查询失败");
        }
        return R.ok(PlayerVOS, "查询成功");
    }
}
