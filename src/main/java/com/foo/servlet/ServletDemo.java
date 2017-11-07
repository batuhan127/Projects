package com.foo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ServletDemo")
public class ServletDemo extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String[] outerArray = request.getParameterValues("telno");

        response.setContentType("text.html");
        PrintWriter out = response.getWriter();
        int i = 1;
        out.println("<html><form>" +
                "Name:" + name + "<br/>" +
                "Surname:" + surname + "<br/>");
        for (String telno : outerArray) {
            out.println("Tel No " + i + ": " + telno + "<br/>");
            i++;
        }
        out.println("</form></html>");
        //jıkıjookı

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
