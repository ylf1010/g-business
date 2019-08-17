package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.XuService;
import com.jk.util.BootStrapUtil;
import com.jk.util.RowsTotal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("xu")
public class XuController {
        //客户管理模块
    @Reference
    private XuService xu;


    //跳转到客户列表页
    @RequestMapping("Xkehu1")
    public  String   Xkehu1(){
        return  "Xkehu1";
    }


    //客户列表查询
    @RequestMapping("xkehulist")
    @ResponseBody
    public RowsTotal xkehulist(@RequestBody BootStrapUtil bt){

        RowsTotal  list=xu.xkehulist(bt);
        return  list;
    }
}
