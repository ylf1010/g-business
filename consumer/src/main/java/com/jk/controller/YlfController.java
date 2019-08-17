package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.User;
import com.jk.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ylf")
public class YlfController {

    @Reference
    private LoginService loginService;

    @RequestMapping("tologinUser")
    public String tologinUser(){
        return "loginUser";
    }

   @RequestMapping("loginUser")
    @ResponseBody
    public String loginUser(User user){
         User loginUser = loginService.loginUser(user);
         if(loginUser==null){
             return "usererror";
         }
         if(!user.getPassword().equals(loginUser.getPassword())){
             return "passerror";
         }

       return "success";
   }
}
