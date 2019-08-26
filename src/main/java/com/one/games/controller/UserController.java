package com.one.games.controller;


import com.one.games.domain.entity.User;
import com.one.games.service.UserService;
import com.one.games.utils.Result;
import com.one.games.utils.UserBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author k&d
 * @Date 2019/8/26 17:39
 */
@Slf4j
@RestController
public class UserController {

    @Resource
    UserService userService;
    /**
     * 前端数据过来,与后台交互
     */
    @RequestMapping("/register")
    public Result register() {
        try {
            UserBean user = userService.registerUser();
            return Result.success(user);
        }catch (Exception ex) {
            return Result.error();
        }
    }

}
