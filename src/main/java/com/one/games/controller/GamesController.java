package com.one.games.controller;



import com.one.games.domain.entity.GameDetails;
import com.one.games.domain.entity.User;
import com.one.games.service.GameDetailService;
import com.one.games.service.UserService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author k&d
 * @Date 2019/8/26 17:39
 */
@Slf4j
@RestController()
@RequestMapping("/api")
public class GamesController {

    @Resource
    UserService userService;
    @Resource
    GameDetailService gameDetailService;
    /**
     * 登录
     * @param username
     * @param userPassword
     * @param ma
     * @param session
     * @return
     */
    /*@RequestMapping(value = "/login" ,method=RequestMethod.POST)*/
    @GetMapping("/login")
    public ModelAndView login(String username,String userPassword,ModelAndView ma,HttpSession session){
        try {
            User user = userService.login(username,userPassword);
            if(user!=null){
              /*登录成功,将user设置到作用域*/
                session.setAttribute("user",user);
            }else {
                ma.addObject("message","账号或者密码错误,请重新输入");
                ma.setViewName("error");
            }
            return ma;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @RequestMapping("/regsiter")
   /* @GetMapping("/register")*/
    public String regsiter(User user) {
        try {
            String username = user.getUsername();
            //判断是否存在
            if(userService.findByUserName(username)==null){
                //数据库中没有该用户,可以注册
                userService.register(user);
                return "";
            }
            return "error";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
    @GetMapping("/show")
    public List<GameDetails>  show(int gameDetailsId) {
        try {
            if (gameDetailsId!=0){
                List<GameDetails>  gameDetails = gameDetailService.showDetails(gameDetailsId);
                return gameDetails;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
