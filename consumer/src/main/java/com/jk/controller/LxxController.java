package com.jk.controller;

import com.jk.model.RenZhengBean;


import com.jk.service.LxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("lxx")
public class LxxController {

    @Autowired
    private LxxService lxxService;

    //店铺信息
    @RequestMapping("ShopMessage")
    public String dprz(){
        return "lxx/ShopMessageLxx";
    }

    //认证中转
    @RequestMapping("AuthenticationTransfer")
    public String rzzg(){
        return "lxx/AuthenticationTransferLxx";
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

    //新增//修改
    @RequestMapping("addShop")
    @ResponseBody
    public Boolean addBookList(RenZhengBean renZhengBean) {
        try {
                lxxService.addShop(renZhengBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
