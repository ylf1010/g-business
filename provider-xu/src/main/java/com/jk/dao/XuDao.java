package com.jk.dao;

import com.jk.model.*;

import java.util.List;
import java.util.Map;

public interface XuDao {

         //客户
    Integer xkehulistcount(Map map);

    List<User_xu> xkehulist(Map map);

    Integer xdelete1(String[] ids);

    List<Zu_xu> xxiala1();

    void xdelete1jifen(String[] ids);

    void xaddfenzu(Zu_xu zu);

    void xupdate1(Integer id, Integer a);

    List<User_xu> xkehuxiangqing(Integer keid);

    void xupdatekehu(User_xu userx);

    void xupdatejifen(Jifen_xu jifen);




            // 会员
    Integer uhiuyuancount(Map map);

    List<Um_xu> uhiuyuancha(Map map);


    Integer quxiaohiuyuan(String[] ids);

    void deleteum_xu(String[] ids);



    List<Member_xu> uHiuYuanShezhi();
}
