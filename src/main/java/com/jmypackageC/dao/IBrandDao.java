package com.jmypackageC.dao;

import com.jmypackageC.pojo.Brand;

import java.util.List;

public interface IBrandDao {
    public List<Brand> getListSBrand();   //查询出所有品牌
    public int addBrand(Brand brand);   //添加品牌
    public int deleBrand(int id);  //删除品牌
    public Brand getOneBrand(int id);  //查找一个品牌
    public int amendBrand(Brand brand);  //修改品牌
}
