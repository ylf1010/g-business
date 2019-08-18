package com.jk.service;



import com.jk.model.AreaBeanLxx;
import com.jk.model.RenZhengBean;

import java.util.List;


public interface LxxService {


    int addShop(RenZhengBean renZhengBean);


    int addEnterprise(RenZhengBean renZhengBean);


    int addIndividual(RenZhengBean renZhengBean);


    List<AreaBeanLxx> findArea(Integer id);
}