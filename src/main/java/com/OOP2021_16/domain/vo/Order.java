package com.OOP2021_16.domain.vo;

public class Order {

    private int id;
    private String userName;
    private String realName;
    private int orderMonth;
    private String orderDate;
    private String orderState;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getOrderMonth() {
        return orderMonth;
    }

    public void setOrderMonth(int orderMonth) {
        this.orderMonth = orderMonth;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", orderMonth=" + orderMonth +
                ", orderDate='" + orderDate + '\'' +
                ", orderState='" + orderState + '\'' +
                '}';
    }
}
