package com.jmypackageC.service;

import com.jmypackageC.pojo.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getLists();   //查询出数据
    public int add(Product product);  //添加
    public int dele(int id);   //删除
    public Product getOne(int id);  //查询一个对象
    public int amend(Product product);   //修改
}
