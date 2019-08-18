package com.jk.service;

import com.jk.model.Zu_xu;
import com.jk.util.ztx.BootStrapUtil;
import com.jk.util.ztx.RowsTotal;

import java.util.List;

public interface XuService {

    RowsTotal xkehulist(BootStrapUtil bt);

    void xdelete1(String[] ids);

    List<Zu_xu> xxiala1();

    void xupdate1(Integer[] ids, Integer a);

    void xaddfenzu(Zu_xu zu);
}
