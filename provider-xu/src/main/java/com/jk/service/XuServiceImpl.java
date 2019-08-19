package com.jk.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.XuDao;
import com.jk.model.User_xu;
import com.jk.model.Zu_xu;
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

        Map map=new HashMap();
        //条件
        map.put("name",bt.getName());
        map.put("hiuyuan",bt.getHiuyuan());
        map.put("stajifen",bt.getStajifen());
        map.put("endjifen",bt.getEndjifen());
        map.put("zuselect1",bt.getZuselect1());

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

    //批删
    @Override
    public void xdelete1(String[] ids) {
        Integer a=xu.xdelete1(ids); //删除客户信息
        if (a > 0){
            xu.xdelete1jifen(ids);  //删除客户同时删除对应积分信息
        }
    }

    //下拉 分组
    @Override
    public List<Zu_xu> xxiala1() {
        return xu.xxiala1();
    }

    //移动移出分组
    @Override
    public void xupdate1(Integer[] ids, Integer a) {
        for (int i=0; i<ids.length;i++){
            xu.xupdate1(ids[i],a);
        }

    }

    //新建分组
    @Override
    public void xaddfenzu(Zu_xu zu) {
        xu.xaddfenzu(zu);
    }
}
