package com.jk.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

import com.jk.dao.LxxMapper;
import com.jk.model.RenZhengBean;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class LxxServiceImpl implements LxxService{

    @Autowired
    private LxxMapper lxxMapper;

    @Override
    public int addShop(RenZhengBean renZhengBean) {

        int i = lxxMapper.addShop(renZhengBean);
        return i;
    }
    //新增店铺

}
