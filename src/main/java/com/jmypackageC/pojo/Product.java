package com.jmypackageC.pojo;

public class Product {  //商品 /*一表对应一个类*/
    private Integer productId;  //商品id
    private String productName;  //商品名称
    private double price;   //商品价格
    private String productDes;   //商品描述
    private String url;  //图片
    private Integer count;  //库存
    private Integer brandId; //品牌id
    /*构造方法*/
    public Product() {
    }

    public Product(Integer productId, String productName, double price, String productDes, String url, Integer count, Integer brandId) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDes = productDes;
        this.url = url;
        this.count = count;
        this.brandId = brandId;
    }
    /*get和set*/
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDes() {
        return productDes;
    }

    public void setProductDes(String productDes) {
        this.productDes = productDes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /*toString*/
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", productDes='" + productDes + '\'' +
                ", url='" + url + '\'' +
                ", count=" + count +
                ", brandId=" + brandId +
                '}';
    }
}
