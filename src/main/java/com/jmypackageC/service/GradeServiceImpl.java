package com.jmypackageC.service;

import com.jmypackageC.dao.GradeDaoImpl;
import com.jmypackageC.dao.IGradeDao;
import com.jmypackageC.pojo.Grade;

import java.util.List;

public class GradeServiceImpl implements IGradeService {
    private IGradeDao dao = new GradeDaoImpl();
    @Override
    public List<Grade> getListsGrade() {
        return dao.getListsGrade();
    }
}
