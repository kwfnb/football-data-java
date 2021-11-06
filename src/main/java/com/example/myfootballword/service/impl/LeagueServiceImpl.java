package com.example.myfootballword.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.myfootballword.entity.League;
import com.example.myfootballword.entity.Team;
import com.example.myfootballword.mapper.LeagueMapper;
import com.example.myfootballword.mapper.TeamMapper;
import com.example.myfootballword.service.LeagueService;
import com.example.myfootballword.vo.LeagueTeamVO;
import com.example.myfootballword.vo.LeagueVO;
import com.example.myfootballword.vo.TeamVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeagueServiceImpl extends ServiceImpl<LeagueMapper, League> implements LeagueService {
    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<LeagueVO> selectLeague() {
        List<League> listTable = baseMapper.selectAll();
        List<LeagueVO> leagueVOS = new ArrayList<>();
        listTable.stream().forEach(item -> {
            LeagueVO leagueVO = new LeagueVO();
            leagueVO.setLeagueMatchId(item.getLeagueMatchId());
            leagueVO.setLeagueMatchName(item.getLeagueMatchName());
            leagueVO.setLeagueLevel(item.getLeagueLevel());
            leagueVO.setLntercontinentalQuota(item.getLntercontinentalQuota());
            leagueVOS.add(leagueVO);
        });
        return leagueVOS;
    }

    @Override
    public List<LeagueTeamVO> selectLeagueTeam() {
        List<League> listTable = baseMapper.selectAll();
        List<LeagueTeamVO> leagueVOS = new ArrayList<>();
        for (League item : listTable) {
            LeagueTeamVO leagueTeamVO = new LeagueTeamVO();
            leagueTeamVO.setLeagueMatchName(item.getLeagueMatchName());
            List<Team> teamList = teamMapper.selectByLeagueMatchId(item.getLeagueMatchId());
            List<TeamVO> leagueTeamVOList = teamList.stream().map((list) -> {
                TeamVO teamVO = new TeamVO();
                teamVO.setTeamName(list.getTeamName());
                teamVO.setAttackValue(list.getAttackValue());
                teamVO.setDefenseValue(list.getDefenseValue());
                return teamVO;
            }).collect(Collectors.toList());
            leagueTeamVO.setTeamList(leagueTeamVOList);
            leagueVOS.add(leagueTeamVO);
        }
        return leagueVOS;
    }
}
