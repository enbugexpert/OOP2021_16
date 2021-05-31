package com.OOP2021_16.servlet;

import com.OOP2021_16.dao.UserDao;
import com.OOP2021_16.dao.impl.UserDaoImpl;
import com.OOP2021_16.util.SHAUtil;
import com.OOP2021_16.domain.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends BaseServlet {

    private UserDao userDao = new UserDaoImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        preprocess(response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userDao.findByUsername(username);
        if(user != null){
            if(!SHAUtil.hash(password).equalsIgnoreCase(user.getPassword())){
                response.setStatus(0);
            }else{
                request.getSession().setAttribute("username",username);
                request.getSession().setAttribute("id",user.getId());
            }
        }else{
            response.setStatus(0);
        }
    }
}
