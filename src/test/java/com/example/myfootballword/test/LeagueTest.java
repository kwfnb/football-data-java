package com.example.myfootballword.test;

import com.example.myfootballword.service.LeagueService;
import com.example.myfootballword.vo.LeagueTeamVO;
import com.example.myfootballword.vo.TeamVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeagueTest {
    @Autowired
    private LeagueService leagueService;

    @Test
    public void testSelect(){
        leagueService.selectLeague();
    }

    @Test
    public void testSelectLeagueTeam(){
        List<LeagueTeamVO> leagueTeamVOS = leagueService.selectLeagueTeam();
        leagueTeamVOS.stream().forEach(item -> {
            System.out.println("name:" + item.getLeagueMatchName());
            for (TeamVO teamVO : item.getTeamList()){
                System.out.println("teamVO:" + teamVO);
            }
        });
    }
}
