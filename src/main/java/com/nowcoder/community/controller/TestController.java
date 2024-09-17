package com.nowcoder.community.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @RequestMapping(path = "/cookie/set",method = RequestMethod.GET)
    public String setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("username","lucifer");
        //设置生效的路径
        cookie.setPath("/community");
        //设置cookie的生存时间
        cookie.setMaxAge(60*10);
        //发送cookie
        response.addCookie(cookie);
        return "cookie set!";
    }

    @RequestMapping(path = "/cookie/get",method = RequestMethod.GET)
    @ResponseBody
    public String getCookie(@CookieValue("username") String name){
        return "hello"+name;
    }

    /**
     * session 设置的示例函数
     * @return
     */
    @RequestMapping(path = "/session/set",method = RequestMethod.GET)
    @ResponseBody
    public String setSession(HttpSession session){
        session.setAttribute("id",1);
        session.setAttribute("username","lucifermiao");
        return "session set";
    }


    @RequestMapping(path = "/session/get",method = RequestMethod.GET)
    @ResponseBody
    public String getSession(HttpSession session){
        return (String)session.getAttribute("username");
    }


}
