package com.hss.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestRestController {
    @RequestMapping(value = "/testRest/{id}/{uname}")
    public String testRest(@PathVariable("id") Integer id, @PathVariable("uname") String uname){
        System.out.println("id = " + id);
        System.out.println("uname = " + uname);
        return "success";
    }
}
