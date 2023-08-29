package com.example.demo;

import com.example.demo.entity.Subject;
import com.example.demo.repositories.SubjectRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SubjectListServlet", value = "/SubjectListServlet")
public class SubjectListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            SubjectRepository sr = new SubjectRepository();
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>  SubjectsList :: </h1><hr>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>Subject ID</th>");
            out.println("<th>Subject Name</th>");
            out.println("<th>Subject Credit</th>");
            out.println("</tr>");

            for(Subject subject : sr.findAll()){
                   out.println("<tr>");
                out.println("<td>" + subject.getSubjectId() + "</td>");
                out.println("<td>" + subject.getSubjectName() + "</td>");
                out.println("<td>" + subject.getSubjectCredit() + "</td>");
                out.println("</tr>");
            }
            out.println("<br>");
            out.println("<h2>Browser: </h2>");

            out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}