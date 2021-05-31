package com.OOP2021_16.domain;

import java.util.Date;

public class Feedback {

    private int id;
    private String addressType;
    private String address;
    private String sex;
    private String content;
    private Date submitDate;

    public Feedback(String addressType, String address, String sex, String content, Date submitDate) {
        this.addressType = addressType;
        this.address = address;
        this.sex = sex;
        this.content = content;
        this.submitDate = submitDate;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", addressType='" + addressType + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", content='" + content + '\'' +
                ", submitDate=" + submitDate +
                '}';
    }
}
