<%-- 
    Document   : ProcessData
    Created on : Sep 8, 2018, 3:52:20 PM
    Author     : Aptech
--%>


<%@ page language="java" import="java.sql.*"%>

<%

    String Username = request.getParameter("uusername");

    String Email = request.getParameter("uemail");

    String Password = request.getParameter("upass");

    

    try {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parijat","root","");

        PreparedStatement ps = con.prepareStatement("insert into login(?,?,?)");

        ps.setString(1, Username);

        ps.setString(2, Email);

        ps.setString(3, Password);

       
        ps.executeUpdate();

        out.println("Data saved successfully");

    } catch (Exception e) {

        out.println(e);

    } 

%>