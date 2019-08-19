package com.jk.service;

import com.jk.model.Product;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;

public interface LyProductService {
    PageUtil querylyProduct(ParameUtil parame);

    //List<Classify> queryClassify();

    void updateproductzt(int productid, int zt);

    void addProduct(Product product);

    void delProduct(String dids);

    Product queryProductPage(String id);

    void updateProduct(Product product);
}
