package com.jmypackageC.pojo;

import java.util.List;

public class Brand {
    private int brandId;   //品牌id
    private String brandName;  //品牌名称
    private String brandDescribe;  //品牌描述
    private List<Product> lists;  //当前品牌下的全部商品
    /*构造方法*/
    public Brand() {
    }

    public Brand(int brandId, String brandName, String brandDescribe, List<Product> lists) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandDescribe = brandDescribe;
        this.lists = lists;
    }
    /*set和get*/
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandDescribe() {
        return brandDescribe;
    }

    public void setBrandDescribe(String brandDescribe) {
        this.brandDescribe = brandDescribe;
    }

    public List<Product> getLists() {
        return lists;
    }

    public void setLists(List<Product> lists) {
        this.lists = lists;
    }
    /*toString*/
    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", brandDescribe='" + brandDescribe + '\'' +
                ", lists=" + lists +
                '}';
    }
}
