package com.jmypackageC.service;

import com.jmypackageC.dao.IProductDao;
import com.jmypackageC.dao.ProductDaoImpl;
import com.jmypackageC.pojo.Product;

import java.util.List;

public class ProductServiceImpl implements IProductService {
    private IProductDao dao = new ProductDaoImpl();
    @Override
    public List<Product> getLists() {   //调用dao层查询数据
        return dao.getLists();
    }

    @Override
    public int add(Product product) {     //调用dao层的添加方法
        return dao.add(product);
    }

    @Override
    public int dele(int id) {     //调用dao层的删除方法
        return dao.dele(id);
    }

    @Override
    public Product getOne(int id) {   //调用dao层的查找一个对象方法
        return dao.getOne(id);
    }

    @Override
    public int amend(Product product) {   //调用dao层的修改方法
        return dao.amend(product);
    }
}
