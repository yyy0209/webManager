package com.jmypackageC.service;

import com.jmypackageC.pojo.Brand;

import java.util.List;

public interface IBrandService {
    public List<Brand> getListSBrand();   //查询出所有品牌
    public int addBrand(Brand brand);   //添加品牌
}
