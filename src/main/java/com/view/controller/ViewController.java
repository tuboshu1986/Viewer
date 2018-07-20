package com.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/view")
public class ViewController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello!!!";
    }
    
}
