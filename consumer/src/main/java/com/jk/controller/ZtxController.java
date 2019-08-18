package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.ZtxRole;
import com.jk.model.ZtxTree;
import com.jk.service.ZtxService;
import com.jk.util.ParameUtil;
import com.jk.util.TreeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ztx")
public class ZtxController {

    @Reference
    private ZtxService zs;

    @RequestMapping("tomain")
    public String tomain(){
        return "ztx/main";
    }
    @RequestMapping("toshowrole")
    public String toshowrole(){
        return "ztx/showrole";
    }
    @RequestMapping("toaddrole")
    public String toaddrole(){
        return "ztx/addrole";
    }
    @RequestMapping("toshowuser")
    public String toshowuser(){
        return "ztx/showuser";
    }

    //五表查权限
    @RequestMapping("querytree")
    @ResponseBody
    public List<ZtxTree> querytree(HttpServletRequest request){
        //UsersModel user = (UsersModel) request.getSession().getAttribute("users");
        List<ZtxTree> list = zs.querytree();
        list = TreeUtil.getFatherNode(list);
        return list;
    }

    //查角色
    @RequestMapping("queryrole")
    @ResponseBody
    public   Map  queryrole(@RequestBody ParameUtil param ){
        List list=zs.queryrole(param);
        Long l=zs.queryrolecount(param);
        Map map=new HashMap();
        map.put("rows", list);
        map.put("total", l);
        return map;
    }
    //查用户
    @RequestMapping("queryuser")
    @ResponseBody
    public   Map  queryuser(@RequestBody ParameUtil param ){
        List list=zs.queryuser(param);
        Long l=zs.queryusercount(param);
        Map map=new HashMap();
        map.put("rows", list);
        map.put("total", l);
        return map;
    }
    //根据 角色id查询对应权限
    @RequestMapping("edittree")
    @ResponseBody
    public  List<ZtxTree>  edittree(Integer roleid){
        List<ZtxTree> list = zs.edittree(roleid);
        list = TreeUtil.getFatherNode(list);
        return list;
    }
    //根据 用户id查询对应角色
    @RequestMapping("editrole")
    @ResponseBody
    public  List<ZtxRole>  editrole(Integer id){
        List<ZtxRole> list = zs.editrole(id);
        return list;
    }
    //根据 用户id查询对应角色
    @RequestMapping("hxrole")
    public String  hxrole(Integer id, Model model){
        List<ZtxRole> list = zs.editrole(id);
        model.addAttribute("id",id);
        model.addAttribute("list",list);
        return "ztx/hxrole";
    }

    @RequestMapping("updatetree")
    @ResponseBody
    public void updatetree(Integer[] ids,Integer roleid){
        zs.updatetree(ids,roleid);
    }
    @RequestMapping("updaterole")
    @ResponseBody
    public void updaterole(Integer[] ids,Integer id){
        zs.updaterole(ids,id);
    }

    //新增角色
    @RequestMapping("addrole")
    @ResponseBody
    public void addrole(ZtxRole role){
        zs.addrole(role);
    }
    //删除角色
    @RequestMapping("deleterole")
    @ResponseBody
    public void deleterole(String ids){
        zs.deleterole(ids);
    }
    //删除用户
    @RequestMapping("deleteuser")
    @ResponseBody
    public void deleteuser(String ids){
        zs.deleteuser(ids);
    }
    @RequestMapping("updatestatus")
    @ResponseBody
    public void updatestatus(Integer id,Integer status){
        System.out.println(id+status);
        zs.updatestatus(id,status);
    }

}
