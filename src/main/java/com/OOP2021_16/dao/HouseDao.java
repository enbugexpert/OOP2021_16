package com.OOP2021_16.dao;

import com.OOP2021_16.domain.House;
import java.util.List;

public interface HouseDao extends BaseDao<House> {

    List<House> findAll(int ownerId);

}
