package com.ante.servlet;

import javax.servlet.HttpConstraintElement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RequestTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String passwd = req.getParameter("pwsswd");
        String[] hobbys = req.getParameterValues("hobbys");
        System.out.println(Arrays.toString(hobbys));
        System.out.println(userName+passwd+"这是打印处理");
        //跳转页面的方法
        //resp.sendRedirect("/r/success.jsp");
        req.getRequestDispatcher("/success.jsp").forward(req,resp);



    }

}
