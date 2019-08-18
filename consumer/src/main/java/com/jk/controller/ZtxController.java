package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.ZtxTree;
import com.jk.service.ZtxService;
import com.jk.util.ztx.TreeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("ztx")
public class ZtxController {

    @Reference
    private ZtxService zs;

    @RequestMapping("tomain")
    public String tomain(){
        return "ztx/main";
    }

    //五表查权限
    @RequestMapping("querytree")
    @ResponseBody
    public List<ZtxTree> querytree(){
        //UsersModel user = (UsersModel) request.getSession().getAttribute("users");
        List<ZtxTree> list = zs.querytree();
        list = TreeUtil.getFatherNode(list);
        return list;
    }
}
