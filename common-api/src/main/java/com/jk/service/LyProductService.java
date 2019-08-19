package com.jk.service;

import com.jk.model.Classify;
import com.jk.model.Product;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;

import java.util.List;

public interface LyProductService {
    PageUtil querylyProduct(ParameUtil parame);

    List<Classify> queryClassify();

    void updateproductzt(int productid, int zt);

    void addProduct(Product product);

    void delProduct(String dids);

    Product queryProductPage(String productid);

    void updateProduct(Product product);


}
