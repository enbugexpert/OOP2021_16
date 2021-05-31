package com.OOP2021_16.servlet;

import com.OOP2021_16.dao.HouseDao;
import com.OOP2021_16.dao.impl.HouseDaoImpl;
import com.OOP2021_16.domain.House;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/addHouse")
public class AddHouseServlet extends BaseServlet{

    private HouseDao houseDao = new HouseDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, IOException {
        request.setCharacterEncoding("UTF-8");
        int id = (int)request.getSession().getAttribute("id");
        if(id == 0) return;
        String address = request.getParameter("address");
        int floor  = Integer.parseInt(request.getParameter("floor"));
        int defaultRent  = Integer.parseInt(request.getParameter("defaultRent"));
        int area  = Integer.parseInt(request.getParameter("area"));
        int propertyCosts  = Integer.parseInt(request.getParameter("propertyCosts"));
        String residents  = request.getParameter("residents");
        boolean ifCertified  = Integer.parseInt(request.getParameter("ifCertified")) == 1;
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String registerDate  = f.format(new Date());
        String more  = request.getParameter("more");
        House house = new House(id,address,floor,defaultRent,area,propertyCosts,residents,
                ifCertified,registerDate,more);
        houseDao.insert(house);
        response.getWriter().print("{}");
    }

}
