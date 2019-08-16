package com.jk.dao;

import com.jk.model.User_xu;

import java.util.List;
import java.util.Map;

public interface XuDao {
    Integer xkehulistcount(Map map);

    List<User_xu> xkehulist(Map map);
}
