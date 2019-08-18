package com.jk.dao;

import com.jk.model.User;
import com.jk.model.YsqJiaoYi;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
@Select("select * from user where username = #{username}")
    User loginUser(User user);

    void addregisUser(User user);


    @Select("select count(*) from jiaoyi_ysq")
    Integer queryaccountSumCount();
   @Select("select * from jiaoyi_ysq limit #{start},#{end}")
    List<YsqJiaoYi> findaccountSum(Map map);
}