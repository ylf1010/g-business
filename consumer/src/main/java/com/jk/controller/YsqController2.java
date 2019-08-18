package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.RefundService;
import com.jk.util.DataGridResult;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("ysqtwo")
public class YsqController2 {
    @Reference
    private RefundService refundService;
    @RequestMapping("cha")
    @ResponseBody
    public DataGridResult cha(ParameUtil parameUtil){
        PageUtil pageUtil = refundService.cha(parameUtil);
        DataGridResult result = new DataGridResult();
        result.setTotal(pageUtil.getSumSize());
        result.setRows(pageUtil.getList());
        return result;
    }
    @RequestMapping("tiao")
    public String tiao(){
        return "cha2";
    }

}
