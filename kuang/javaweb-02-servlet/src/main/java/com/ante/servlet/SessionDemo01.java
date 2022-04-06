package com.ante.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到session
        HttpSession session = req.getSession();
        //给session中存入
        session.setAttribute("name","xiangqian");
        String sessionId = session.getId();
        //判断session是否存在
        if (session.isNew()){
            resp.getWriter().write("session created ,ID" + sessionId);
        }else{
            resp.getWriter().write("session have been created "+ sessionId);
        }

        //手动注销session
        HttpSession session1 = req.getSession();
        session1.removeAttribute("name");
        session.invalidate();
    }
}
