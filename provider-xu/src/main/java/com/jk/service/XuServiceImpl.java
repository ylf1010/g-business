package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.XuDao;
import com.jk.model.User_xu;
import com.jk.util.BootStrapUtil;
import com.jk.util.RowsTotal;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class XuServiceImpl  implements  XuService{
            //客户管理
        @Autowired
    private XuDao xu;


        //客户列表查询
    @Override
    public RowsTotal xkehulist(BootStrapUtil bt) {
        System.out.println(bt.getName());
        Map map=new HashMap();
        //条件
        map.put("name",bt.getName());
        map.put("hiuyuan",bt.getHiuyuan());
        map.put("stajifen",bt.getStajifen());
        map.put("endjifen",bt.getEndjifen());

        //分页
        Integer total=xu.xkehulistcount(map);  //总条数
        map.put("sta", (bt.getPageNumber()-1)*bt.getPageSize());
        map.put("end", bt.getPageSize());
        List<User_xu>  list=xu.xkehulist(map);
        RowsTotal  r=new RowsTotal();
        r.setTotal(total);
        r.setRows(list);
        return r;
    }
}
