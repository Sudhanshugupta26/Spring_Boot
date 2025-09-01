package in.gupta.controller;

import in.gupta.dbcon.DbConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet("/register")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String myname = req.getParameter("name");
        String myemail = req.getParameter("emailId");
        String mypassword = req.getParameter("password");
        String mycity = req.getParameter("city");

        try {
            Connection con = DbConnection.getConnection();
            System.out.println("Connection Established");

            String query = "insert into register values(?,?,?,?)";
            System.out.println("Table Found");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypassword);
            ps.setString(4, mycity);
            int i = ps.executeUpdate();
            System.out.println("Data Inserted");
            if (i > 0) {
                System.out.println("Data Inserted Successfully");
                out.println("<h3 style='color:green'>Successfully Registered</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/login.html");
                rd.include(req, resp);
            } else {
                out.println("<h3 style='color:red'>Registration Failed</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/register.html");
                rd.include(req, resp);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
