package com.hss.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/test")
public class RequestMappingController {

    //此时请求映射所映射的请求的请求路径为：/test/testRequestMapping
//    @RequestMapping("/testRequestMapping")
    // value可以是一个数组，只要满足一个就行
    @RequestMapping(value = {"/test","/testRequestMapping"})
    public String testRequestMapping(){
        return "success";
    }

}

