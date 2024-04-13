package com.javalab.sec18task;

public class Orderdate {

    private int orderId;
    private String orderDay;
    private int orderEmployeeId;
    private int orderProductId;
    private int salesQuantity;

    public Orderdate(int orderId , String orderDay , int orderEmployeeId , int orderProductId , int salesQuantity ){
        this.orderId = orderId;
        this.orderDay = orderDay;
        this.orderEmployeeId = orderEmployeeId;
        this.orderProductId =orderProductId;
        this.salesQuantity = salesQuantity;
    }

    public Orderdate() {

    }

    public int getOrderId() {return orderId;}

    public void setOrderId(int orderId) {this.orderId = orderId;}

    public String getOrderDay() {return orderDay;}

    public void setOrderDay(String orderDay) {this.orderDay = this.orderDay;}

    public int getOrderEmployeeId() {return orderEmployeeId;}

    public void setOrderEmployeeId(int orderEmployeeId) {this.orderEmployeeId = orderEmployeeId;}

    public int getOrderProductId() {return orderProductId;}

    public void setOrderProductId(int oderProductId) {this.orderProductId = oderProductId;}

    public int getSalesQuantity(){return salesQuantity;}

    public void setSalesQuantity(int salesQuantity){this.salesQuantity = salesQuantity;}
}



