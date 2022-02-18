<%-- 
    Document   : Rules
    Created on : Aug 25, 2018, 2:19:31 PM
    Author     : Aptech
--%>
<%@ page language="java" %>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><center>Welcome to the Exam </center></h1>
        <h2><u> Please Check The Rules below  </u></h2>
        
        <h3>1. You will have to click "I Agree" button below and also have to select your level and subject before you proceed to exam </h3>
        <h3>2. 20 Questions will be there for each topic.All are M C Q type questions.You have to select one of four option by clicking the radio button beside every option </h3>
        <h3>3. You will get 20 minutes time to answer the questions. However there is no definite time limit for each of the questions.</h3>
        
        <h3>4. After answering one question,click on the "Next" button to see next question. You can also click to the "Previous" button to see the earlier question.</h3>
        <h3>5. When you finish the test test,click on the "End Exam" button.</h3>
        <h3>6. Your results will be displayed once you have clicked on "End Exam" button</h3>
        
       <form action="/action_page.php">
    <h2> Select level </h2>   
    <select name="Select Level">
        <option value="volvo">Beginners</option>  
        <option value="saab">Professional</option>
   
  </select>
       
     
   
    <h2> Select Topic </h2>   
    <select name="Select Level">
    <option value="C">C</option>
    <option value="C++">C++</option>
    <option value="Java">Java</option>
    <option value="Python">Python</option>
    <option value="HTML5">HTML5</option>
    <option value="PHP">PHP</option>
  </select>
       </form>
        
        
        
        <form>
            <button onclick="myFunction()">Click me</button>
           
   
    
    <script>
    function myFunction() {
        var btn = document.createElement("BUTTON");
        var t = document.createTextNode("SUBMIT");
        btn.appendChild(t);
        document.body.appendChild(btn);
    }
    </script> 
       </form>
    </body>
</html>
