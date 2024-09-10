package com.bankapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class BankLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String accountNumber = request.getParameter("accountNumber");
        String date = request.getParameter("date");

        // Log the login details (you can also send to S3 here or later)
        System.out.println("Name: " + name + ", Account Number: " + accountNumber + ", Date: " + date);

        response.getWriter().println("Welcome " + name + "! Your account number is " + accountNumber + ".");
    }
}

