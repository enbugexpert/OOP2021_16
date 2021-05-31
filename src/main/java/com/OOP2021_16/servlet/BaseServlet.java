package com.OOP2021_16.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BaseServlet extends HttpServlet {

    public void preprocess(HttpServletResponse response){
        response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        /* 允许跨域的主机地址 */
        response.setHeader("Access-Control-Allow-Origin", "*");
        /* 允许跨域的请求方法GET, POST, HEAD 等 */
        response.setHeader("Access-Control-Allow-Methods", "*");
        /* 重新预检验跨域的缓存时间 (s) */
        response.setHeader("Access-Control-Max-Age", "3600");
        /* 允许跨域的请求头 */
        response.setHeader("Access-Control-Allow-Headers", "*");
        /* 是否携带cookie */
        response.setHeader("Access-Control-Allow-Credentials", "true");
    }

    public void preprocess(HttpServletRequest request){

    }

    public void write(HttpServletResponse response,String json){
        try {
            PrintWriter out = response.getWriter();//响应对象的输出流:管道
            out.print(json);
            out.flush();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
