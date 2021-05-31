package com.OOP2021_16.servlet;
import com.OOP2021_16.dao.RenterDao;
import com.OOP2021_16.dao.impl.RenterDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// 在个人资料界面查用户的：用户名、邮箱、房产数量
@WebServlet("/basicInfo")
public class BasicInfoServlet  extends BaseServlet{

    private RenterDao renterDao = new RenterDaoImpl();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("receive post msg from basicInfo!");

    }
}
