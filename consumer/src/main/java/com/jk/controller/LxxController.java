package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lxx")
public class LxxController {

    //店铺信息
    @RequestMapping("ShopMessage")
    public String dprz(){
        return "ShopMessageLxx";
    }

    //认证中转
    @RequestMapping("AuthenticationTransfer")
    public String rzzg(){
        return "AuthenticationTransfer";
    }

    //企业认证
    @RequestMapping("Enterprise")
    public String qyrz(){
        return "EnterpriseLxx";
    }

    //个人认证
    @RequestMapping("Individual")
    public String grrz(){
        return "IndividualLxx";
    }
}
