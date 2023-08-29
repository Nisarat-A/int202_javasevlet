package com.example.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.String;

@WebServlet(name = "CalcGradeServlet", value = "/grade")
public class CalcGradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int score = Integer.valueOf(request.getParameter("score"));
        calGrade calGrade = new calGrade(score);
        PrintWriter out = response.getWriter();
        String color;
        out.println("<html><body>");
        out.println("<h1>Calculate Grade Servlet </h1>");

        out.println("<h3> your score is "+ score + "</h3>" );

        if (calGrade.getGrade().equalsIgnoreCase("A"))
             color = "green";
        else if (calGrade.getGrade().equalsIgnoreCase("B"))
             color = "blue";
        else if (calGrade.getGrade().equalsIgnoreCase("C"))
             color = "yellow";
        else if (calGrade.getGrade().equalsIgnoreCase("D"))
             color = "orange";
        else if (calGrade.getGrade().equalsIgnoreCase("F"))
             color = "red";
        else
            color = "black";
        out.println("<br>");
        out.println("<h3> your grade is   </h3>" + "<font color=" + color + ">" + calGrade.getGrade() + "</font>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
