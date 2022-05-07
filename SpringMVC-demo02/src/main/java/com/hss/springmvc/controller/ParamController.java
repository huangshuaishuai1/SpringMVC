package com.hss.springmvc.controller;

import com.hss.springmvc.bean.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/testBean")
    public String testBean(User user) {
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/testRequesHeader")
    public String testRequestHeader(@RequestParam(value = "user_name") String username, String password, @RequestHeader("Host") String host) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        System.out.println("host = " + host);
        return "success";
    }

    @RequestMapping("/testRequesParam")
    public String testRequestParam(@RequestParam(value = "user_name") String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "success";
    }

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username);
        System.out.println("password = " + password);
        return "success";
    }

    @RequestMapping("/")
    public String paramIndex() {
        return "param";
    }
}
