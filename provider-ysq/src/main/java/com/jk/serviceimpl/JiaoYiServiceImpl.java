package com.jk.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.dao.YsqJiaoYiMapper;
import com.jk.model.YsqJiaoYi;
import com.jk.service.JiaoYiService;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class JiaoYiServiceImpl implements JiaoYiService {
    @Autowired
    private YsqJiaoYiMapper jiaoYiDao;

    @Override
    public PageUtil cha(ParameUtil parameUtil) {

        PageHelper.startPage(1,1);
        /*if(parameUtil.getStatus()==0){
            parameUtil.setStatus(null);
        }*/
        List<YsqJiaoYi> list = jiaoYiDao.cha(parameUtil);
        PageInfo<YsqJiaoYi> info = new PageInfo<>(list);
        PageUtil pageUtil = new PageUtil((int)info.getTotal(),1,1);
        pageUtil.setList(list);
        return pageUtil;
    }
}
