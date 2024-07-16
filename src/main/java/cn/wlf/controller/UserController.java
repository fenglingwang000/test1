package cn.wlf.controller;

import cn.wlf.entity.UserScore;
import cn.wlf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    //第一次提交
    //第一次提交
    @Autowired
    private UserService userService;
    /**
     * 查询成绩
     * @return
     */
    @GetMapping("/score")
    public List<UserScore> queryScore(){
        List<UserScore> list = userService.queryScore();
        return list;
    }
}
