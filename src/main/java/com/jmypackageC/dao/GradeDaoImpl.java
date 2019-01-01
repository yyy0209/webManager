package com.jmypackageC.dao;

import com.jmypackageC.pojo.Grade;
import com.jmypackageC.utilTest.JdbcUtil;
import com.jmypackageC.utilTest.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class GradeDaoImpl implements IGradeDao {
    @Override
    public List<Grade> getListsGrade() { //查询出所有等级
        return JdbcUtil.executQuery("select * from grade", new RowMap<Grade>() {
            @Override
            public Grade rowMapping(ResultSet rs) {    ////把ResultSet类型对象转换
                Grade grand = new Grade();
                try {
                    grand.setGrade_id(rs.getInt("grade_id"));
                    grand.setJurisdiction(rs.getString("jurisdiction"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return grand;
            }
        }, null);
    }
}
