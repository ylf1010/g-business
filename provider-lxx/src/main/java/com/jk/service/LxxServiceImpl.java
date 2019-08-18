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
    //新增店铺
    @Override
    public String addShop(RenZhengBean renZhengBean) {


        return lxxMapper.addShop(renZhengBean);
    }
    //新增企业认证
    @Override
    public String addEnterprise(RenZhengBean renZhengBean) {

        return lxxMapper.addEnterprise(renZhengBean);
    }
    //新增个人认证
    @Override
    public String addIndividual(RenZhengBean renZhengBean) {

        return lxxMapper.addIndividual(renZhengBean);
    }


}
