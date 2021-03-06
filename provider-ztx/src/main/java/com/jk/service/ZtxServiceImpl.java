package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.ZtxRoleMapper;
import com.jk.dao.ZtxRoleTreeMapper;
import com.jk.dao.ZtxTreeMapper;
import com.jk.dao.ZtxUserRoleMapper;
import com.jk.model.ZtxRole;
import com.jk.model.ZtxRoleTree;
import com.jk.model.ZtxTree;
import com.jk.model.ZtxUserRole;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ZtxServiceImpl implements ZtxService{

    @Autowired
    private ZtxTreeMapper tm;
    @Autowired
    private ZtxRoleMapper rm;
    @Autowired
    private ZtxRoleTreeMapper rtm;
    @Autowired
    private ZtxUserRoleMapper urm;

    @Override
    public List<ZtxTree> querytree() {
        return tm.querytree();
    }

    @Override
    public List queryrole(ParameUtil param) {
        int papa=(param.getPageNumber()-1)*param.getPageSize();
        return rm.queryrole(param.getRolename(),papa,param.getPageSize());
    }

    @Override
    public Long queryrolecount(ParameUtil param) {
        return rm.queryrolecount(param);
    }

    @Override
    public List<ZtxTree> edittree(Integer roleid) {
        //查出  角色 id  所对应的 菜单 的id
        List<String> list =  rtm.querytreebyid(roleid);
        // 查询所有 的菜单
        List<ZtxTree>  listTwo = tm.querytreeall();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < listTwo.size(); j++) {
                // 用  原来 选中的 菜单id  和所有的  菜单id  对比 ，对比成功 就选中
                if(list.get(i).equals(listTwo.get(j).getId().toString())){
                    listTwo.get(j).setChecked("true");
                }
            }
        }
        return listTwo;
    }

    @Override
    public void updatetree(Integer[] ids, Integer roleid) {
        //先 删除 原有的 关联
        int i  = rtm.deletetree(roleid);
        //再建立  新的 关联
        if(i >=0){
            for (int j = 0; j < ids.length; j++) {
                ZtxRoleTree rpm = new ZtxRoleTree();
                rpm.setTreeid(ids[j]);
                rpm.setRoleid(roleid);
                i = rtm.addrtm(rpm);
            }
        }
    }

    @Override
    public void addrole(ZtxRole role) {
        rm.addrole(role);
    }

    @Override
    public void deleterole(String  ids) {
        rm.deleterole(ids);
    }

    @Override
    public List queryuser(ParameUtil param) {
        int papa=(param.getPageNumber()-1)*param.getPageSize();
        return rm.queryuser(param.getUsername(),papa,param.getPageSize());
    }

    @Override
    public Long queryusercount(ParameUtil param) {
        return rm.queryusercount(param);
    }

    @Override
    public List<ZtxRole> editrole(Integer id) {
        //查出  角色 id  所对应的 菜单 的id
        List<String> list =  urm.queryrolebyid(id);
        // 查询所有 的菜单
        List<ZtxRole>  listTwo = rm.queryroleall();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < listTwo.size(); j++) {
                // 用  原来 选中的 菜单id  和所有的  菜单id  对比 ，对比成功 就选中
                if(list.get(i).equals(listTwo.get(j).getRoleid().toString())){
                    listTwo.get(j).setChecked("true");
                }
            }
        }
        return listTwo;
    }

    @Override
    public void updaterole(Integer[] ids, Integer id) {
        //先 删除 原有的 关联
        int i  = urm.deleterole(id);
        //再建立  新的 关联
        if(i >=0){
            for (int j = 0; j < ids.length; j++) {
                ZtxUserRole rpm = new ZtxUserRole();
                rpm.setRoleid(ids[j]);
                rpm.setUserid(id);
                i = urm.addurm(rpm);
            }
        }
    }

    @Override
    public void deleteuser(String ids) {
        rm.deleteuser(ids);
    }

    @Override
    public void updatestatus(Integer id, Integer status) {
        if(status==1){
            urm.updatestatus(id,2);
        }else{
            urm.updatestatus(id,1);
        }
    }
}
