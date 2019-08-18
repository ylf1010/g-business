package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.JiaoYiService;
import com.jk.util.DataGridResult;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ysqone")
public class YsqController1 {
    @Reference
    private JiaoYiService jiaoYiService;




    @RequestMapping("cha")
    @ResponseBody
    public DataGridResult cha(@RequestBody ParameUtil parameUtil){
        PageUtil pageUtil = jiaoYiService.cha(parameUtil);
        DataGridResult result = new DataGridResult();
        result.setTotal(pageUtil.getSumSize());
        result.setRows(pageUtil.getList());

        return result;
    }
    @RequestMapping("tiao")
    public String tiao(){
        return "cha";
    }
}
