package com.jk.service;

import com.jk.model.Jifen_xu;
import com.jk.model.Member_xu;
import com.jk.model.User_xu;
import com.jk.model.Zu_xu;
import com.jk.util.ztx.BootStrapUtil;
import com.jk.util.ztx.RowsTotal;

import java.util.List;

public interface XuService {

       //客户
    RowsTotal xkehulist(BootStrapUtil bt);

    void xdelete1(String[] ids);

    List<Zu_xu> xxiala1();

    void xupdate1(Integer[] ids, Integer a);

    void xaddfenzu(Zu_xu zu);

    List<User_xu> xkehuxiangqing(Integer keid);

    void xupdatekehu(User_xu userx);

    void xupdatejifen(Jifen_xu jifen);


       //会员

    RowsTotal uhiuyuancha(BootStrapUtil bt);

    void quxiaohiuyuan(String[] ids);

    List<Member_xu> uHiuYuanShezhi();
}
