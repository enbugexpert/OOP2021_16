package com.OOP2021_16.dao.impl;

import com.OOP2021_16.util.JDBCUtil;
import com.OOP2021_16.dao.HouseDao;
import com.OOP2021_16.domain.House;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class HouseDaoImpl implements HouseDao {

    private QueryRunner qr = new QueryRunner(JDBCUtil.getInstance().getDataSource());

    @Override
    public List<House> findAll() {
        String sql = "SELECT * FROM house";
        try {
            return qr.query(sql, new BeanListHandler<>(House.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<House> findAll(int ownerId) {
        String sql = "SELECT * FROM house WHERE ownerId=" + ownerId;
        try {
            return qr.query(sql, new BeanListHandler<>(House.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public House findById(int id) {
        return null;
    }

    @Override
    public int insert(House house) {
        String sql = "INSERT INTO house ( ownerId, address, floor, defaultRent" +
                ", area,propertyCosts,residents,ifCertified,registerDate,more )" +
                " values(?,?,?,?,?,?,?,?,?,?)";
        try {
            return qr.update(sql,house.getOwnerId(),house.getAddress(),house.getFloor()
            ,house.getDefaultRent(),house.getArea(),house.getPropertyCosts(),house.getResidents(),
                    house.isIfCertified(),house.getRegisterDate(),house.getMore());
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int update(House obj) {
        return 0;
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM house WHERE id=?";
        try {
            return qr.execute(sql,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
