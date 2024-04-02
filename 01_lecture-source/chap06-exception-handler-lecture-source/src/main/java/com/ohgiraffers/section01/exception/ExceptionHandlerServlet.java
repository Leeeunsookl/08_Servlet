package com.ohgiraffers.section01.exception;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/showErrorPage")
public class ExceptionHandlerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 필기.
        *   Request 객체에는 parameter 영역과 attribute 영역이 존재한다.
        *   attribute 영역에는 뭐가 있지?
        *  */

        Enumeration<String> attrNames = req.getAttributeNames();
        while (attrNames.hasMoreElements()) {
            System.out.println(attrNames.nextElement());
        }

    }
}
