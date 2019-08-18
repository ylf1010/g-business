package com.jk.service;

import com.jk.model.ZtxRole;
import com.jk.model.ZtxTree;
import com.jk.util.ParameUtil;

import java.util.List;

public interface ZtxService {
    List<ZtxTree> querytree();

    List queryrole(ParameUtil param);

    Long queryrolecount(ParameUtil param);

    List<ZtxTree> edittree(Integer roleid);

    void updatetree(Integer[] ids, Integer roleid);

    void addrole(ZtxRole role);

    void deleterole(String ids);

    List queryuser(ParameUtil param);

    Long queryusercount(ParameUtil param);

    List<ZtxRole> editrole(Integer id);

    void updaterole(Integer[] ids, Integer id);

    void deleteuser(String ids);

    void updatestatus(Integer id, Integer status);
}
