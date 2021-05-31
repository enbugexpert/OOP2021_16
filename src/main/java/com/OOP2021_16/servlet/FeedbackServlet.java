package com.OOP2021_16.servlet;

import com.OOP2021_16.dao.FeedbackDao;
import com.OOP2021_16.dao.impl.FeedbackDaoImpl;
import com.OOP2021_16.domain.Feedback;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/feedback")
public class FeedbackServlet extends BaseServlet{

    private FeedbackDao feedbackDao = new FeedbackDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("doGet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String addressType = request.getParameter("addressType");
        String address = request.getParameter("address");
        String sex = request.getParameter("sex");
        String content = request.getParameter("content");
        Feedback feedback = new Feedback(addressType,address,sex,content,new Date());
        feedbackDao.insert(feedback);
        response.sendRedirect("/feedback/succeed.html");
    }
}
