package com.jmypackageC.dao;

import com.jmypackageC.pojo.Brand;
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
                Brand p = new Brand();
                try {
                    p.setBrandId(rs.getInt("brand_id"));
                    p.setBrandName(rs.getString("brand_name"));
                    p.setBrandDescribe(rs.getString("brand_describe"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, null);
    }

    @Override
    public int addBrand(Brand brand) {  //添加品牌
        return JdbcUtil.executeUpdate("insert into brand(brand_id,brand_name,brand_describe) values(?,?,?)",brand.getBrandId(),brand.getBrandName(),brand.getBrandDescribe());
    }

    @Override
    public int deleBrand(int id) {   //删除品牌
        return JdbcUtil.executeUpdate("delete from brand where brand_id=?",id);
    }

    @Override
    public Brand getOneBrand(int id) {   //查找一个品牌
        return JdbcUtil.queryOne("select * from brand where product_id=?", new RowMap<Brand>() {
            @Override
            public Brand rowMapping(ResultSet rs) {
                Brand p = new Brand();
                try {
                    p.setBrandId(rs.getInt("brand_id"));
                    p.setBrandName(rs.getString("brand_name"));
                    p.setBrandDescribe(rs.getString("brand_describe"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return p;
            }
        }, id);
    }

    @Override
    public int amendBrand(Brand brand) {   //修改品牌
        return 0;
    }
}
