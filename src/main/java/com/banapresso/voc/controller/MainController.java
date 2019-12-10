package com.banapresso.voc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MainController {

    @RequestMapping(value = "/")
    public String doMain(){
        return "main";
    }

    @RequestMapping(value = "/upload")
    public String uploadComplete(){
        return "ok";
    }
}
