package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Zu_xu;
import com.jk.service.XuService;
import com.jk.util.ztx.BootStrapUtil;
import com.jk.util.ztx.RowsTotal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("xu")
public class XuController {
        //客户管理模块
    @Reference
    private XuService xu;


    //跳转到客户列表页
    @RequestMapping("Xkehu1")
    public  String   Xkehu1(){
        return  "xu/Xkehu1";
    }


    //客户列表查询
    @RequestMapping("xkehulist")
    @ResponseBody
    public RowsTotal xkehulist(@RequestBody BootStrapUtil bt){
        RowsTotal  list=xu.xkehulist(bt);
        return  list;
    }

    //批量删除
    @RequestMapping("xdelete1")
    @ResponseBody
    public void xdelete1(String[] ids){
        xu.xdelete1(ids);
    }

    //下拉 分组
    @RequestMapping("xxiala1")
    @ResponseBody
    public List<Zu_xu> xxiala1(){
        List<Zu_xu>  list= xu.xxiala1();
        return list;
    }

    //移动移出分组
    @RequestMapping("xupdate1")
    @ResponseBody
    public void xupdate1(Integer[] ids,Integer a){
        xu.xupdate1(ids,a);
    }

    //新建分组
    @RequestMapping("xaddfenzu")
    @ResponseBody
    public void xaddfenzu(Zu_xu zu){
        xu.xaddfenzu(zu);
    }
}
