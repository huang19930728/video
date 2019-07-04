package com.video.videoweb;

import com.video.videodao.pojo.bean.User;
import com.video.videoservice.user.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Api(value="测试")
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @PutMapping("/save")
    @ApiOperation("user添加")
    @ResponseBody
    public int  save(){
        User user=new User();
        user.setId("2");
        user.setNamn("Q");
        userService.insert(user);
        return 1;
    }
    @GetMapping("/select")
    @ApiOperation("user查询")
    @ResponseBody
    public List<User> select(){
       List<User> list=userService.getUserAll();
       return list;
    }

}
