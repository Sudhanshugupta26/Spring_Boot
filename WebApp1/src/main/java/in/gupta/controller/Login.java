package in.gupta.controller;

import in.gupta.dbcon.DbConnection;
import in.gupta.model.User;
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
import java.sql.ResultSet;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String myemail = req.getParameter("emailId");
        String mypassword = req.getParameter("password");

        try{
            Connection con = DbConnection.getConnection();
            String query = "select * from register where email=? and password=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,myemail);
            ps.setString(2,mypassword);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                User user = new User();
                user.setEmailId(rs.getString("email"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setCity(rs.getString("city"));
                req.getSession().setAttribute("user",user);
                out.println("<h3 style='color:green'>Login Successful</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
                rd.forward(req,resp);
            }else{
                out.println("<h3 style='color:red'>Login Failed</h3>");
                RequestDispatcher rd = req.getRequestDispatcher("/login.html");
                rd.include(req, resp);
            }
        }catch (Exception e) {
                throw new RuntimeException(e);
        }
    }
}
