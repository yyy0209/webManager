package com.jmypackageC.service;

import com.jmypackageC.dao.BrandDaoImpl;
import com.jmypackageC.dao.IBrandDao;
import com.jmypackageC.pojo.Brand;

import java.util.List;

public class BrandServiceImpl implements IBrandService {
    private IBrandDao dao = new BrandDaoImpl();
    @Override
    public List<Brand> getListSBrand() {    //查询多个品牌
        return dao.getListSBrand();
    }

    @Override
    public int addBrand(Brand brand) {   //添加品牌
        return dao.addBrand(brand);
    }

    @Override
    public int deleBrand(int id) {  //删除品牌

        return dao.deleBrand(id);
    }

    @Override
    public Brand getOneBrand(int id) {   //查询一个品牌
        return dao.getOneBrand(id);
    }

    @Override
    public int amendBrand(Brand brand) {  //修改品牌
        return dao.amendBrand(brand);
    }
}
