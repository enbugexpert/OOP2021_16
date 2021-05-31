package com.OOP2021_16.domain;

public class Renter {

    private int id;
    private String landlord;
    private String userName;
    private String realName;
    private String rentedHouseId;
    private String rentingDate;
    private String endingDate;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRentedHouseId() {
        return rentedHouseId;
    }

    public void setRentedHouseId(String rentedHouseId) {
        this.rentedHouseId = rentedHouseId;
    }

    public String getRentingDate() {
        return rentingDate;
    }

    public void setRentingDate(String rentingDate) {
        this.rentingDate = rentingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public void setLandlord(String landlord) {
        this.landlord = landlord;
    }

    public String getLandlord() {
        return landlord;
    }

    @Override
    public String toString() {
        return "Renter{" +
                "id=" + id +
                ", landlord='" + landlord + '\'' +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", rentedHouseId='" + rentedHouseId + '\'' +
                ", rentingDate='" + rentingDate + '\'' +
                ", endingDate='" + endingDate + '\'' +
                '}';
    }
}
