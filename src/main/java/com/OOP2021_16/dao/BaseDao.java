package com.OOP2021_16.dao;

import java.util.List;

public interface BaseDao<T> {

    List<T> findAll();

    T findById(int id);

    int insert(T obj);

    int update(T obj);

    int delete(int id);
}
