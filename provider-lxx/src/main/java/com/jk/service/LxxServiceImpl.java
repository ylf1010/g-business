package com.jk.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;

import com.jk.dao.LxxMapper;
import com.jk.model.AreaBeanLxx;
import com.jk.model.RenZhengBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class LxxServiceImpl implements LxxService{

    @Autowired
    private LxxMapper lxxMapper;
    //新增店铺
    @Override
    public int addShop(RenZhengBean renZhengBean) {

        int i = lxxMapper.addShop(renZhengBean);
        return i;

    }
    //新增企业认证
    @Override
    public int addEnterprise(RenZhengBean renZhengBean) {
        int i = lxxMapper.addEnterprise(renZhengBean);
        return i;

    }
    //新增个人认证
    @Override
    public int addIndividual(RenZhengBean renZhengBean) {
        int i = lxxMapper.addIndividual(renZhengBean);
        return i;

    }

    //三级联动
    @Override
    public List<AreaBeanLxx> findArea(Integer id) {
        return lxxMapper.findArea(id);
    }


}
