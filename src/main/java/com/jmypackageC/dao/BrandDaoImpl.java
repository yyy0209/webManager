package com.jmypackageC.dao;

import com.jmypackageC.pojo.Brand;
import com.jmypackageC.pojo.Product;
import com.jmypackageC.utilTest.JdbcUtil;
import com.jmypackageC.utilTest.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BrandDaoImpl implements IBrandDao {
    @Override
    public List<Brand> getListSBrand() {   //查询出所有品牌
        return JdbcUtil.executQuery("select * from brand", new RowMap<Brand>() {
            @Override
            public Brand rowMapping(ResultSet rs) {    ////把ResultSet类型对象转换为Product类型
                Brand brand = new Brand();
                IProductDao dao = new ProductDaoImpl();
                try {
                    brand.setBrandId(rs.getInt("brand_id"));
                    brand.setBrandName(rs.getString("brand_name"));
                    brand.setBrandDescribe(rs.getString("brand_describe"));
                    Integer brandId = brand.getBrandId();  //获取当前品牌id
                    List<Product> lists = dao.getLists(brandId);
                    brand.setLists(lists);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return brand;
            }
        }, null);
    }

    @Override
    public int addBrand(Brand brand) {  //添加品牌
        return JdbcUtil.executeUpdate("insert into brand(brand_name,brand_describe) values(?,?)",brand.getBrandName(),brand.getBrandDescribe());
    }

    @Override
    public int deleBrand(int id) {   //删除品牌
        IProductDao dao = new ProductDaoImpl();
        List<Product> lists = dao.getLists(id);
        for (Product e:lists
             ) {
            int productId = e.getProductId();  //获取商品id
            dao.dele(productId);
        }
        return JdbcUtil.executeUpdate("delete from brand where brand_id=?",id);
    }

    @Override
    public Brand getOneBrand(int id) {   //查找一个品牌
        return JdbcUtil.queryOne("select * from brand where brand_id=?", new RowMap<Brand>() {
            @Override
            public Brand rowMapping(ResultSet rs) {
                Brand brand = new Brand();
                IProductDao dao = new ProductDaoImpl();
                try {
                    brand.setBrandId(rs.getInt("brand_id"));
                    brand.setBrandName(rs.getString("brand_name"));
                    brand.setBrandDescribe(rs.getString("brand_describe"));
                    Integer brandId = brand.getBrandId();  //获取当前品牌id
                    List<Product> lists = dao.getLists(brandId);  //通过品牌id查找这个品牌的全部商品
                    brand.setLists(lists);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return brand;
            }
        }, id);
    }

    @Override
    public int amendBrand(Brand brand) {   //修改品牌
        return JdbcUtil.executeUpdate("update brand set brand_name=?,brand_describe=? where brand_id=?",brand.getBrandName(),brand.getBrandDescribe(),brand.getBrandId());
    }
}
