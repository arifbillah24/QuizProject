/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class sqlconnect {

    public sqlconnect() {System.out.println("object created successfully");
    }
    
public void getQuestion() {

    Scanner sc=new Scanner(System.in);
try {

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhaskar?autoReconnect=true&useSSL=false","root",""); 
Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=stmt.executeQuery(" SELECT * FROM kbc ORDER BY RAND() LIMIT 5");
int count=0,marks=0;
while(rs.next())
{
 System.out.println(rs.getString(1)+" "+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4)+""+rs.getString(5)+""+rs.getString(6));
System.out.println("Enter answer");
String s1=sc.nextLine();
//String ans=sc.next();
//String answer=rs.getString("ANSWER");
//if(ans.equalsIgnoreCase(answer))System.out.println("correct");
//else System.out.println("incorrect");
if(s1.equalsIgnoreCase(rs.getString(7)))
{
    System.out.println("correct");
    count++;
}
else
    System.out.println("wrong");
}
System.out.println("Exam is finished");
System.out.println("Marks obtained="+count+"out of 5");
marks=(count*20);
System.out.println("Marks is="+marks);
} 
catch (Exception e){e.printStackTrace();} 
}
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aptech
 */

