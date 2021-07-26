package com.example.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yn.qiao
 * @version 1.0
 * @create 2021-07-26 17:42
 **/
@Controller
public class SecurityController {

    @GetMapping("index")
    public String index(){
        return "index";
    }
}
