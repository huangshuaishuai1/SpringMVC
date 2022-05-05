package com.hss.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TestMethodController {
    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    public String testPost() {
        return "success";
    }
}
