package com.example.myfootballword.controller;

import com.example.myfootballword.service.LeagueService;
import com.example.myfootballword.util.R;
import com.example.myfootballword.vo.LeagueTeamVO;
import com.example.myfootballword.vo.LeagueVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/league")
@Api(value = "league", tags = "联赛模块")
public class LeagueController {
    @Autowired
    private LeagueService leagueService;

    @GetMapping("/selectAll")
    public R selectAll(){
        List<LeagueVO> leagueVOS = leagueService.selectLeague();
        if(leagueVOS.size() == 0){
            return R.failed("查询失败");
        }
        return R.ok(leagueVOS, "查询成功");
    }

    @GetMapping("/selectTeamLeague")
    public R selectTeamLeague(){
        List<LeagueTeamVO> leagueTeamVO = leagueService.selectLeagueTeam();
        if(leagueTeamVO.size() == 0){
            return R.failed("查询失败");
        }
        return R.ok(leagueTeamVO, "查询成功");
    }
}
