package com.OOP2021_16.servlet;

import com.OOP2021_16.dao.HouseDao;
import com.OOP2021_16.dao.impl.HouseDaoImpl;
import com.alibaba.fastjson.JSON;
import com.OOP2021_16.domain.House;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

// 搜索房产
@WebServlet("/house")
public class HouseServlet extends BaseServlet{


    private HouseDao houseDao = new HouseDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        int id = (int)request.getSession().getAttribute("id");
        if(id == 0) return;
        preprocess(response);
        String keyword = request.getParameter("keyword");
        List<House> list = houseDao.findAll(id);
        if (keyword != null) {
            list.removeIf(order -> !order.getAddress().contains(keyword));
        }
        write(response, JSON.toJSONString(list));
    }

}
