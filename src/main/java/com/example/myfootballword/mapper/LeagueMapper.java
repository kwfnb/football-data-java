package com.example.myfootballword.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.myfootballword.entity.League;
import com.example.myfootballword.vo.LeagueVO;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface LeagueMapper extends BaseMapper<League> {
    @Select("select * from league")
    List<League> selectAll();
}
