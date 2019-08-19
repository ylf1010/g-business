/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LyProductServiceImpl
 * Author:   ly
 * Date:     2019/8/16 19:41
 * Description: LyProductServiceImpl
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.dao.ClassifyMapper;
import com.jk.dao.ProductMapper;
import com.jk.model.Product;
import com.jk.util.PageUtil;
import com.jk.util.ParameUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈LyProductServiceImpl〉
 *
 * @author ly
 * @create 2019/8/16
 * @since 1.0.0
 */
@Service
public class LyProductServiceImpl implements LyProductService{
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ClassifyMapper classifyMapper;
    @Override
    public PageUtil querylyProduct(ParameUtil parame) {
        PageHelper.startPage(parame.getPageNumber(), parame.getPageSize());
        Map<String,Object> map = new HashMap<>();
        if(parame != null && parame.getProductname() != null && parame.getProductname().length()>0){

            map.put("productname", parame.getProductname());
        }
        if(parame !=null && parame.getFlid() !=null && parame.getFlid()!=-1){
            map.put("flid", parame.getFlid());
        }
        List<Product> list=productMapper.querylyProduct(parame);
        PageInfo<Product> pageInfo=new PageInfo<Product>(list);
        PageUtil pageUtil= new PageUtil((int) pageInfo.getTotal(),parame.getPageNumber(),parame.getPageSize());
        pageUtil.setList(list);
    return pageUtil;
    }
    //分类
   /* @Override
    public List<Classify> queryClassify() {

        return classifyMapper.queryClassify();
    }*/
    //上下架
    @Override
    public void updateproductzt(int productid, int zt) {
        productMapper.updateproductzt(productid,zt);
    }

    @Override
    public void addProduct(Product product) {
        product.setProductsxj(1);
        product.setProductpid(2);
        productMapper.addProduct(product);
    }

    @Override
    public void delProduct(String dids) {
        productMapper.delProduct(dids);

    }

    @Override
    public Product queryProductPage(String id) {

        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateByPrimaryKey(product);
    }


}
