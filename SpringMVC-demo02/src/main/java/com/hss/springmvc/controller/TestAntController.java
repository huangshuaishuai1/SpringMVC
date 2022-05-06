package com.hss.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestAntController {
    @RequestMapping(value = "/test?Ant")
    public String TestAnt1() {
        return "success";
    }

    @RequestMapping(value = "/test*Ant")
    public String TestAnt2() {
        return "success";
    }
    @RequestMapping(value = "/test/**/Ant")
    public String TestAnt3() {
        return "success";
    }
}
