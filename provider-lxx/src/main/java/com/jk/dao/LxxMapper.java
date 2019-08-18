package com.jk.dao;

import com.jk.model.AreaBeanLxx;
import com.jk.model.RenZhengBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LxxMapper {


    //新增店铺
    int addShop(RenZhengBean renZhengBean);


    int addEnterprise(RenZhengBean renZhengBean);


    int addIndividual(RenZhengBean renZhengBean);

    @Select("select * from area_lxx where pid = #{value}")
    List<AreaBeanLxx> findArea(Integer id);
}
