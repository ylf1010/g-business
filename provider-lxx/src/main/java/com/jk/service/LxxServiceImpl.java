package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.LxxMapper;
import com.jk.model.RenZhengBean;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LxxServiceImpl implements LxxService{

    @Autowired
    private LxxMapper lxxMapper;

    //新增店铺
    @Override
    public void addShop(RenZhengBean renZhengBean) {
        LxxMapper.addShop(renZhengBean);
    }
}
