package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.ZtxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ztx")
public class ZtxController {

    @Reference
    private ZtxService zs;

    @RequestMapping("tomain")
    public String tomain(){
        return "ztx/main";
    }
}
