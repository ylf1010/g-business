package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageInfo;
import com.jk.dao.UserMapper;
import com.jk.model.User;
import com.jk.model.YsqJiaoYi;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User loginUser(User user) {
        return userMapper.loginUser(user);
    }

    @Override
    public void addregisUser(User user) {
        userMapper.addregisUser(user);
    }

    @Override
    public PageUtil findaccountSum(ParameUtil parame) {
        Map map = new HashMap();
        map.put("start",(parame.getPageNumber()-1)*parame.getPageSize());
        map.put("end",parame.getPageSize());
        Integer count = userMapper.queryaccountSumCount();
        List<YsqJiaoYi> list = userMapper.findaccountSum(map);
        PageInfo<YsqJiaoYi> info = new PageInfo<>(list);
        PageUtil pageUtil = new PageUtil();
        pageUtil.setList(list);
        pageUtil.setSumSize(count);
        return pageUtil;
    }


}
