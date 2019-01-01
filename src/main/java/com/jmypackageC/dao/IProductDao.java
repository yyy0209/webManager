package com.jmypackageC.dao;

import com.jmypackageC.pojo.Product;

import java.util.List;

public interface IProductDao {
    public List<Product> getLists();   //查询
    public List<Product> getLists(int brandId); //通过品牌id查找出当前品牌的商品
    public int add(Product product);   //添加
    public int dele(int id);  //删除
    public Product getOne(int id);  //查找一个
    public int amend(Product product);  //修改
    public List<Product> getResults(String test); //条件查询
}
