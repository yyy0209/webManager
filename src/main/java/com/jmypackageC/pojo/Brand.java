package com.jmypackageC.pojo;

public class Brand {
    private int brandId;   //品牌id
    private String brandName;  //品牌名称
    private String brandDescribe;  //品牌描述
    /*构造方法*/
    public Brand() {
    }

    public Brand(int brandId, String brandName, String brandDescribe) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandDescribe = brandDescribe;
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
    /*toString*/
    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", brandDescribe='" + brandDescribe + '\'' +
                '}';
    }
}
