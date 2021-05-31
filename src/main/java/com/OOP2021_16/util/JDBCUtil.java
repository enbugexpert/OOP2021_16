package com.OOP2021_16.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtil {

    private static final JDBCUtil INSTANCE = new JDBCUtil();
    private ComboPooledDataSource dataSource;

    private JDBCUtil(){
        try {
            dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
            dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test?useSSL=false&characterEncoding=utf-8&serverTimezone=GMT");
            dataSource.setUser("root");
            dataSource.setPassword("root");
            dataSource.setInitialPoolSize(5);
            dataSource.setMinPoolSize(5);
            dataSource.setMaxPoolSize(10);
            dataSource.setAcquireIncrement(3);
        }catch (PropertyVetoException e){
            e.printStackTrace();
        }
    }

    public static JDBCUtil getInstance() {
        return INSTANCE;
    }

    public ComboPooledDataSource getDataSource() {
        return dataSource;
    }

    public Connection getConnection(){
        try{
            return dataSource.getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection(Connection connection){
        try {
            if(connection!=null && connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
