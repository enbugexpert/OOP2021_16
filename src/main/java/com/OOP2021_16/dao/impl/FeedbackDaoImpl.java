package com.OOP2021_16.dao.impl;

import com.OOP2021_16.util.JDBCUtil;
import com.OOP2021_16.dao.FeedbackDao;
import com.OOP2021_16.domain.Feedback;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.util.List;

public class FeedbackDaoImpl implements FeedbackDao {

    private QueryRunner qr = new QueryRunner(JDBCUtil.getInstance().getDataSource());

    @Override
    public List<Feedback> findAll() {
        return null;
    }

    @Override
    public Feedback findById(int id) {
        return null;
    }

    @Override
    public int insert(Feedback feedback) {
        String sql = "INSERT INTO feedback(addressType, address, sex, content,submitDate) values(?,?,?,?,?)";
        try {
            return qr.update(sql, feedback.getAddressType(),
                    feedback.getAddress(),feedback.getSex(),feedback.getContent(),feedback.getSubmitDate());
        }catch (SQLException e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int update(Feedback obj) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
