package com.example.myfootballword.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.myfootballword.entity.League;
import com.example.myfootballword.entity.Player;
import com.example.myfootballword.mapper.LeagueMapper;
import com.example.myfootballword.mapper.PlayerMapper;
import com.example.myfootballword.service.LeagueService;
import com.example.myfootballword.service.PlayerService;
import com.example.myfootballword.vo.LeagueVO;
import com.example.myfootballword.vo.PlayerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, Player> implements PlayerService {

    @Override
    public List<PlayerVO> selectPlayer() {
        List<Player> listTable = baseMapper.selectPlayerAll();
        List<PlayerVO> playerVOS = new ArrayList<>();
        listTable.stream().forEach(item -> {
            PlayerVO playerVO = new PlayerVO();
            playerVO.setPlayerId(item.getPlayerId());
            playerVO.setPlayerAge(item.getPlayerAge());
            playerVO.setPlayerName(item.getPlayerName());
            playerVO.setPlayerValue(item.getPlayerValue());
            playerVO.setTeamId(item.getTeamId());
            playerVOS.add(playerVO);
        });
        return playerVOS;
    }
}
