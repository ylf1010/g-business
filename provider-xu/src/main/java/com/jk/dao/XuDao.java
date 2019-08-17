package com.jk.dao;

import com.jk.model.User_xu;
import com.jk.model.Zu_xu;

import java.util.List;
import java.util.Map;

public interface XuDao {
    Integer xkehulistcount(Map map);

    List<User_xu> xkehulist(Map map);

    Integer xdelete1(String[] ids);

    List<Zu_xu> xxiala1();

    void xdelete1jifen(String[] ids);

  

    void xaddfenzu(Zu_xu zu);

    void xupdate1(Integer id, Integer a);
}
