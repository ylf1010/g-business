package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("lxx")
public class LxxController {

    //店铺信息
    @RequestMapping("ShopMessage")
    public String dprz(){
        return "lxx/ShopMessageLxx";
    }

    //认证中转
    @RequestMapping("AuthenticationTransfer")
    public String rzzg(){
        return "lxx/AuthenticationTransfer";
    }

    //企业认证
    @RequestMapping("Enterprise")
    public String qyrz(){
        return "lxx/EnterpriseLxx";
    }

    //个人认证
    @RequestMapping("Individual")
    public String grrz(){
        return "lxx/IndividualLxx";
    }
}
