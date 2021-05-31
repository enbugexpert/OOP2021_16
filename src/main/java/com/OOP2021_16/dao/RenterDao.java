package com.OOP2021_16.dao;


import com.OOP2021_16.domain.Renter;
import com.OOP2021_16.domain.vo.Order;

import java.util.List;

public interface RenterDao extends BaseDao<Renter> {

    List<Order> findAllOrders();

    List<Renter> findAll(int landlordId);

    List<Order> findAllOrders(int landlordId);
}
