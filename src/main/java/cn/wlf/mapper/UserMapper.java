package cn.wlf.mapper;

import cn.wlf.entity.UserScore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     *查询成绩
     * @return
     */
    @Select("SELECT u.username, s.project, s.score FROM users u " +
            "JOIN scores s ON u.id = s.student_id ORDER BY s.project, s.score DESC;")
    List<UserScore> queryScore();

}
