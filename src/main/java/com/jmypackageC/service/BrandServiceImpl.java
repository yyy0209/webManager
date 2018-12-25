package com.jmypackageC.service;

import com.jmypackageC.dao.BrandDaoImpl;
import com.jmypackageC.dao.IBrandDao;
import com.jmypackageC.pojo.Brand;

import java.util.List;

public class BrandServiceImpl implements IBrandService {
    private IBrandDao dao = new BrandDaoImpl();
    @Override
    public List<Brand> getListSBrand() {
        return dao.getListSBrand();
    }

    @Override
    public int addBrand(Brand brand) {
        return dao.addBrand(brand);
    }
}
