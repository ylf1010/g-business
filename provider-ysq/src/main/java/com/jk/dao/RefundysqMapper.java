package com.jk.dao;

import com.jk.model.Refundysq;
import com.jk.util.ParameUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RefundysqMapper {

    List<Refundysq> cha(ParameUtil parameUtil);
}