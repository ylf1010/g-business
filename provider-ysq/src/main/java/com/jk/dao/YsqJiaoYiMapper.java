package com.jk.dao;

import com.jk.model.YsqEvaluate;
import com.jk.model.YsqJiaoYi;
import com.jk.util.ParameUtil;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface YsqJiaoYiMapper {

   @Select("select * from jiaoyi_ysq limit #{start},#{end}")
    List<YsqJiaoYi> cha(Map map);
 @Select("select count(*) from jiaoyi_ysq")
    Integer findjiaoyicount(Map map);

    List<YsqEvaluate> cha2(ParameUtil parameUtil);
}