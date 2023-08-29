package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "FavoriteSubjectServlet", value = "/favoriteSubject")
public class FavoriteSubjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String subjects[] = request.getParameterValues("subjects");
        out.println("<html><body>");
        out.println("<h1> Favorite Subjects ::  </h1><hr>");
        out.println("<br>");
        out.println("Your student id is : " + id + "<br>");
        out.println("Your name is : " + name + "<br>");
        out.println("Your favorite subjects are : <br>");
        for (String subject : subjects) {
            out.println("&nbsp;&nbsp;&nbsp;&nbsp;" + subject + "<br>"  );

        }
        out.println("<hr>");
        out.println("<h3>Request parameter using getParameterMap() :: </h3><hr>");
        Map<String,String[]> map = request.getParameterMap();
        out.println("Your student id is : " + map.get("id")[0] + "<br>");
        out.println("Your name is : " + map.get("name")[0] + "<br>");
        out.println("Your favorite subjects are : <br>");
        for (String subject : map.get("subjects")) {
            out.println("&nbsp;&nbsp;&nbsp;&nbsp;" + subject + "<br>"  );
        }
        out.println("<a href=\"favorite_subject.html\">back</a>");
        out.println("</body></html>");


        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}