package com.example.mywebapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Perform custom actions with the form data
        // For example, write to a file or send an email
        
        response.sendRedirect("registration_success.jsp");
    }

    protected String getParameter(HttpServletRequest request, String paramName) {
        return request.getParameter(paramName);
    }
}

