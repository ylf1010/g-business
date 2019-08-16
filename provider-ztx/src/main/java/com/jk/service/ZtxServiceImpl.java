package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.ZtxTreeMapper;
import com.jk.model.ZtxTree;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ZtxServiceImpl implements ZtxService{

    @Autowired
    private ZtxTreeMapper tm;

    @Override
    public List<ZtxTree> querytree() {
        System.out.println(tm.querytree());
        return tm.querytree();
    }
}
