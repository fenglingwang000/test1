package cn.wlf.service;

import cn.wlf.entity.UserScore;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    /**
     * 查询成绩
     * @return
     */
    @Select("select u.username from scores s left join users u on u.id = s.student_id  ")
    List<UserScore> queryScore();

}
