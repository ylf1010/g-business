package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.Jifen_xu;
import com.jk.model.Member_xu;
import com.jk.model.User_xu;
import com.jk.model.Zu_xu;
import com.jk.service.XuService;
import com.jk.util.BootStrapUtil;
import com.jk.util.RowsTotal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("xu")
public class XuController {
        //客户管理模块
    @Reference
    private XuService xu;

                 //客户列表  客户详情
    //跳转到客户列表页
    @RequestMapping("xkehu1")
    public  String   xkehu1(){
        return  "xu/Xkehu1";
    }


    //客户列表查询
    @RequestMapping("xkehulist")
    @ResponseBody
    public RowsTotal xkehulist(@RequestBody BootStrapUtil bt){
        RowsTotal  list=xu.xkehulist(bt);
        return  list;
    }

    //批量删除
    @RequestMapping("xdelete1")
    @ResponseBody
    public void xdelete1(String[] ids){
        xu.xdelete1(ids);
    }

    //下拉 分组
    @RequestMapping("xxiala1")
    @ResponseBody
    public List<Zu_xu> xxiala1(){
        List<Zu_xu>  list= xu.xxiala1();
        return list;
    }

    //移动移出分组
    @RequestMapping("xupdate1")
    @ResponseBody
    public void xupdate1(Integer[] ids,Integer a){
        xu.xupdate1(ids,a);
    }

    //新建分组
    @RequestMapping("xaddfenzu")
    @ResponseBody
    public void xaddfenzu(Zu_xu zu){
        xu.xaddfenzu(zu);
    }



    //跳客户详情页 把id带去
    @RequestMapping("xkehuxiangqing1")
    public String xkehuxiangqing1(Integer  keid, Model m){
        m.addAttribute("a",keid);
        return  "xu/kexiangqing";
    }
    //客户详情查询
    @RequestMapping("xkehuxiangqing")
    @ResponseBody
    public RowsTotal xkehuxiangqing(Integer  keid){
        List<User_xu>  rows= xu.xkehuxiangqing(keid);
         RowsTotal  r=new RowsTotal();
         r.setRows(rows);
        return  r;
    }

    //详情页  加积分
    @RequestMapping("xupdatejifen")
    @ResponseBody
    public void xupdatejifen(Jifen_xu jifen){
       xu.xupdatejifen(jifen);
    }

    //详情页  修改客户信息
    @RequestMapping("xupdatekehu")
    @ResponseBody
    public void xupdatekehu(User_xu userx)
    {
        xu.xupdatekehu(userx);
    }




                //会员列表   会员设置
       //跳转会员列表页
    @RequestMapping("uhiuyuan1")
    public  String  uhiuyuan1(){
        return  "xu/uhiuyuan1";
    }

    //会员列表查询
    @RequestMapping("uhiuyuancha")
    @ResponseBody
    public  RowsTotal  uhiuyuancha(@RequestBody BootStrapUtil bt){
          System.out.println(bt.getPageNumber());
        RowsTotal  list=xu.uhiuyuancha(bt);
        return  list;
    }

    //批量   取消会员
    @RequestMapping("quxiaohiuyuan")
    @ResponseBody
    public  void  quxiaohiuyuan(String[] ids){
        xu.quxiaohiuyuan(ids);
    }



    //跳转会员设置页面
    @RequestMapping("uhiuyuan2")
    public  String  uhiuyuan2(){
        return  "xu/uhiuyuan2";
    }

    //会员设置 查询
    @RequestMapping("uHiuYuanShezhi")
    @ResponseBody
    public RowsTotal uHiuYuanShezhi(){
        List<Member_xu>  rows= xu.uHiuYuanShezhi();
        RowsTotal  r=new RowsTotal();
        r.setRows(rows);
        return  r;
    }
}
