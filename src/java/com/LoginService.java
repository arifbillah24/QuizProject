/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class LoginService {
    public String doLogin(String username, String password){
        Connection con = null;
        String message = null;
        try {
            //loading the driver class
            Class.forName("com.mysql.jdbc.Driver");
            //getting the connection from DriverManager factory Class by passing the connection url and credentials
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parijat","root","");
            //creating prepared statement for our required query
            PreparedStatement statement = con.prepareStatement("SELECT username, password FROM User WHERE username = ? AND password = ?");
            //setting the parameters
            statement.setString(1, username);
            statement.setString(2, password);
            //executing the prepared statement, which returns a ResultSet
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                message = "SUCCESS";
            }else{
                message = "FAILURE";
            }
        } catch (Exception e) {
            message = "FAILURE";
            e.printStackTrace();
        }
        return message;
    }
}