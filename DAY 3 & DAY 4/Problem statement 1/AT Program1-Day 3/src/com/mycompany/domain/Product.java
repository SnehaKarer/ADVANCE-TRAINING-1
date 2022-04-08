package com.mycompany.domain;
/*POJO - plain old java object - classes which are supposed to hold data */
public class Product {

    //since this class holds the same data as the db table, it should have the same fields as the table
    String prod_id;
    String prod_name;
    int prod_price;

    //default constructor
    public Product(){

    }

    public Product(String prod_id, String prod_name, int prod_price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.prod_price = prod_price;
    }

    //getter and setters


    public String getProductid() {
        return prod_id;
    }

    public void setProductid(String productid) {
        this.prod_id = productid;
    }

    public String getProductName() {
        return prod_name;
    }

    public void setProductName(String productName) {
        this.prod_name = productName;
    }

    public int getProductPrice() {
        return prod_price;
    }

    public void setProductPrice(int productPrice) {
        this.prod_price = productPrice;
    }

    @Override
    public String toString(){
        return "Product [productid=" + prod_id + ", productName=" + prod_name + ", productPrice=" + prod_price + "]";
    }

}