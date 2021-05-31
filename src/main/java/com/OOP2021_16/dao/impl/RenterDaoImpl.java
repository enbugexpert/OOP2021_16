package com.OOP2021_16.dao.impl;

import com.OOP2021_16.domain.Renter;
import com.OOP2021_16.util.JDBCUtil;
import com.OOP2021_16.dao.RenterDao;
import com.OOP2021_16.domain.vo.Order;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;

public class RenterDaoImpl implements RenterDao {

    private QueryRunner qr = new QueryRunner(JDBCUtil.getInstance().getDataSource());

    @Override
    public List<Renter> findAll() {
        String sql = "SELECT * FROM renter";
        try {
            return qr.query(sql, new BeanListHandler<>(Renter.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Renter> findAll(int landlordId) {
        String sql = "SELECT * FROM renter WHERE landlordId=" + landlordId;
        try {
            return qr.query(sql, new BeanListHandler<>(Renter.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Order> findAllOrders() {
        String sql = "SELECT renter.id,renter.userName,renter.realName,orders.orderId,orders.orderDate,orders.orderState " +
                "FROM renter INNER JOIN orders ON orders.userId=renter.id";
        try {
            return qr.query(sql, new BeanListHandler<>(Order.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Order> findAllOrders(int landlordId) {
        String sql = "SELECT orders.id,renter.userName,renter.realName,orders.orderMonth,orders.orderDate,orders.orderState " +
                "FROM renter INNER JOIN orders ON orders.userId=renter.id WHERE renter.landlordId=" + landlordId;
        try {
            return qr.query(sql, new BeanListHandler<>(Order.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Renter findById(int id) {
        String sql = "SELECT * FROM renter WHERE id=" + id;
        try {
            return qr.query(sql, new BeanHandler<>(Renter.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public int insert(Renter renter) {
        String sql = "INSERT INTO renter(userName, realName) values(?,?)";
        try {
            return qr.update(sql, renter.getUserName(), renter.getRealName());
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int update(Renter renter) {
        String sql = "UPDATE renter SET userName=?&realName=? WHERE userName=?";
        try {
            return qr.update(sql, renter.getUserName(),renter.getRealName(),renter.getUserName());
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM renter WHERE id=?";
        try {
            return qr.execute(sql,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

}
