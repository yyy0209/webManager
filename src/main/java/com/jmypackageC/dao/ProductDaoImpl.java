package com.jmypackageC.dao;

import com.jmypackageC.pojo.Product;
import com.jmypackageC.utilTest.JdbcUtil;
import com.jmypackageC.utilTest.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoImpl implements IProductDao {
    @Override
    public List<Product> getLists() {  /*这个方法查询全部数据，返回到List集合*/
        return JdbcUtil.executQuery("select * from product", new RowMap<Product>() {
            @Override
            public Product rowMapping(ResultSet rs) {    ////把ResultSet类型对象转换为Product类型
                Product p = new Product();
                try {
                    p.setProductId(rs.getInt("product_id"));
                    p.setPrice(rs.getDouble("price"));
                    p.setProductDes(rs.getString("product_des"));
                    p.setProductName(rs.getString("product_name"));
                    p.setUrl(rs.getString("url"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, null);
    }

    @Override
    public int add(Product product) {   //添加
        return JdbcUtil.executeUpdate("insert into product(product_name,price,product_des,url) values(?,?,?,?)",product.getProductName(),product.getPrice(),product.getProductDes(),product.getUrl());
    }

    @Override
    public int dele(int id) {   //删除
        return JdbcUtil.executeUpdate("delete from product where product_id=?",id);  //调用工具层的方法，进行删除这个对象
    }

    @Override
    public Product getOne(int id) {   //查找一个
        return JdbcUtil.queryOne("select * from product where product_id=?", new RowMap<Product>() {
            @Override
            public Product rowMapping(ResultSet rs) {
                Product p = new Product();
                try {
                    p.setProductName(rs.getString("product_name"));
                    p.setProductDes(rs.getString("product_des"));
                    p.setPrice(rs.getDouble("price"));
                    p.setUrl(rs.getString("url"));
                    p.setProductId(id);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, id);
    }

    @Override
    public int amend(Product product) {   //修改
        int k = JdbcUtil.executeUpdate("update product set product_name=?,price=?,product_des=?,url=? where product_id=?",product.getProductName(),product.getPrice(),product.getProductDes(),product.getUrl(),product.getProductId());
            return k;
    }
}
