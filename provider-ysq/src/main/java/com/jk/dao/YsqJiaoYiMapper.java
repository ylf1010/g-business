package com.jk.dao;

import com.jk.model.YsqJiaoYi;
import com.jk.util.ztx.ParameUtil;

import java.util.List;

public interface YsqJiaoYiMapper {

    List<YsqJiaoYi> cha(ParameUtil parameUtil);
}