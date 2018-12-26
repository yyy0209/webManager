package com.jmypackageC.dao;

import com.jmypackageC.pojo.Brand;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMain {  //单元测试
    IBrandDao dao = new BrandDaoImpl();
    @Before
    public void before(){   //前期工作  可以不用
        System.out.println("这是before方法");
    }
    @Test   //单元测试要加这个注解
    public void test(){
        Brand brand = dao.getOneBrand(6);
        System.out.println(brand);
    }
    @Test
    public void test1(){
        System.out.println("这是test1方法");
    }
    @After
    public void after(){  //后期工作  可以不用
        System.out.println("这是after方法");
    }
}
