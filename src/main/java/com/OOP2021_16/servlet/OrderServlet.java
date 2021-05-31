package com.OOP2021_16.servlet;

import com.OOP2021_16.dao.RenterDao;
import com.OOP2021_16.dao.impl.RenterDaoImpl;
import com.alibaba.fastjson.JSON;
import com.OOP2021_16.domain.vo.Order;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/order")
public class OrderServlet extends BaseServlet {

    private RenterDao renterDao = new RenterDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        int id = (int)request.getSession().getAttribute("id");
        if(id == 0) return;
        preprocess(response);
        String keyword = request.getParameter("keyword");
        List<Order> list = renterDao.findAllOrders(id);
        if (keyword != null) {
            list.removeIf(order -> !order.getRealName().contains(keyword));
        }
        write(response, JSON.toJSONString(list));
    }

}
