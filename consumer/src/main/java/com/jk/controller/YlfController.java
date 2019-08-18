package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.User;
import com.jk.service.LoginService;
import com.jk.util.CheckImgUtil;
import com.jk.util.DataGridResult;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("ylf")
public class YlfController {

    @Reference
    private LoginService loginService;
    //跳转登录页面
    @RequestMapping("tologinUser")
    public String tologinUser(){
        return "loginUser";
    }
    //跳转注册页面
    @RequestMapping("toregister")
    public String toregister(){
        return "register";
    }
    //跳转账户总览页面
    @RequestMapping("toaccountSum")
    public String toaccountSum(){
        return "accountSum";
    }
    //获取图片验证码
    @RequestMapping("getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response){

        CheckImgUtil.buildCheckImg(request, response);

    }
    //商家登录
   @RequestMapping("loginUser")
    @ResponseBody
    public String loginUser(User user, HttpServletRequest request,String code){
         User loginUser = loginService.loginUser(user);

         String readCode = request.getSession().getAttribute("checkcode").toString();

               if(!readCode.toLowerCase().equals(code.toLowerCase())){
                   return "codeError";
               }
               if(loginUser==null){
                   return "usererror";
               }
               if(!user.getPassword().equals(loginUser.getPassword())){
                   return "passerror";
               }
         request.getSession().setAttribute("user",loginUser);
         return "success";
   }
   //注册
   @RequestMapping("register")
    @ResponseBody
    public String reisterUser(User user){
       User regigUser = loginService.loginUser(user);
       if(regigUser!=null&&!"".equals(regigUser)){
           return "usernull";
       }
       user.setUsercraetetime(new Date());
       loginService.addregisUser(user);

        return "regissuccess";
   }

    @RequestMapping("findaccountSum")
    @ResponseBody
    public DataGridResult cha(@RequestBody ParameUtil parame){
        PageUtil pageUtil = loginService.findaccountSum(parame);
        DataGridResult result = new DataGridResult();
        result.setTotal(pageUtil.getSumSize());
        result.setRows(pageUtil.getList());

        return result;
    }


}
