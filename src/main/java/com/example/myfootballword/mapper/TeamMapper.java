package com.example.myfootballword.mapper;

        import com.baomidou.mybatisplus.core.mapper.BaseMapper;
        import com.example.myfootballword.entity.League;
        import com.example.myfootballword.entity.Team;
        import org.apache.ibatis.annotations.Param;
        import org.apache.ibatis.annotations.Select;
        import org.mapstruct.Mapper;

        import java.util.List;

@Mapper
public interface TeamMapper extends BaseMapper<Team> {

    @Select("select * from team where league_match_id = #{leagueMatchId}")
    List<Team> selectByLeagueMatchId(@Param("leagueMatchId") int leagueMatchId);
}
