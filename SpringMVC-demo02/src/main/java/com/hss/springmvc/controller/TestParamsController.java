package com.hss.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestParamsController {
    @RequestMapping(value = "/testParams", params = {"username=hss","password=123"})
    public String testParams() {
        return "success";
    }
}
