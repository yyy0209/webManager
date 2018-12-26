package com.jmypackageC.service;

import com.jmypackageC.pojo.Brand;

import java.util.List;

public interface IBrandService {
    public List<Brand> getListSBrand();   //查询出所有品牌
    public int addBrand(Brand brand);   //添加品牌
    public int deleBrand(int id);   //删除品牌
    public Brand getOneBrand(int id);  //查询一个对象品牌
    public int amendBrand(Brand brand);   //修改品牌
}
