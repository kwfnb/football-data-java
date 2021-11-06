package com.example.myfootballword.service;

import com.example.myfootballword.vo.LeagueTeamVO;
import com.example.myfootballword.vo.LeagueVO;

import java.util.List;

public interface LeagueService {
    List<LeagueVO> selectLeague();

    List<LeagueTeamVO> selectLeagueTeam();
}
