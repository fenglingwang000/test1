package cn.wlf.service.Impl;

import cn.wlf.entity.UserScore;
import cn.wlf.mapper.UserMapper;
import cn.wlf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 查询成绩
     * @return
     */
    public List<UserScore> queryScore() {
        System.out.println("调用UserMapper进行查询");
      List<UserScore> list = userMapper.queryScore();
      return list;
    }
}
