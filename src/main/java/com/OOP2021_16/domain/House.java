package com.OOP2021_16.domain;

public class House {

    private int id;
    private int ownerId;
    private String address;
    private int floor;
    private int defaultRent;
    private int area;
    private int propertyCosts;
    private String residents;
    private boolean ifCertified;
    private String registerDate;
    private String more;

    public House() {

    }

    public House(int ownerId, String address, int floor, int defaultRent, int area, int propertyCosts, String residents, boolean ifCertified, String registerDate, String more) {
        this.ownerId = ownerId;
        this.address = address;
        this.floor = floor;
        this.defaultRent = defaultRent;
        this.area = area;
        this.propertyCosts = propertyCosts;
        this.residents = residents;
        this.ifCertified = ifCertified;
        this.registerDate = registerDate;
        this.more = more;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getDefaultRent() {
        return defaultRent;
    }

    public void setDefaultRent(int defaultRent) {
        this.defaultRent = defaultRent;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPropertyCosts() {
        return propertyCosts;
    }

    public void setPropertyCosts(int propertyCosts) {
        this.propertyCosts = propertyCosts;
    }

    public String getResidents() {
        return residents;
    }

    public void setResidents(String residents) {
        this.residents = residents;
    }

    public boolean isIfCertified() {
        return ifCertified;
    }

    public void setIfCertified(boolean ifCertified) {
        this.ifCertified = ifCertified;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", ownerId=" + ownerId +
                ", address='" + address + '\'' +
                ", floor=" + floor +
                ", defaultRent=" + defaultRent +
                ", area=" + area +
                ", propertyCosts=" + propertyCosts +
                ", residents=" + residents +
                ", ifCertified=" + ifCertified +
                ", registerDate='" + registerDate + '\'' +
                ", more='" + more + '\'' +
                '}';
    }
}
