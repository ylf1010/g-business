package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ylf")
public class YlfController {

    @Reference
    private LoginService loginService;

   @RequestMapping("loginUser")
    @ResponseBody
    public String loginUser(){

       return "success";
   }
}
