package com.example.myfootballword.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.myfootballword.entity.Player;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PlayerMapper extends BaseMapper<Player> {

    @Select("select * from player")
    List<Player> selectPlayerAll();
}
