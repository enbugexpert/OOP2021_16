package com.OOP2021_16;

import com.OOP2021_16.dao.RenterDao;
import com.OOP2021_16.dao.impl.RenterDaoImpl;

public class Main {

    public static void main(String[] args) {
        RenterDao dao = new RenterDaoImpl();
        System.out.println(dao.findAll());
    }

}
