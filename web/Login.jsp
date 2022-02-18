<%-- 
    Document   : Login
    Created on : Sep 15, 2018, 5:44:12 PM
    Author     : Aptech
--%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>jQuery AJAX example with Java</title>
      <script src="https://code.jquery.com/jquery-1.11.3.min.js" integrity="sha256-7LkWEzqTdpEfELxcZZlS6wAx5Ff13zZ83lYO2/ujj7g="  crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/mystyle.css" type="text/css"/>
    
    </head>
    <body>
        <center>
            <div class="container_login">
            <div class="login">
               
                <h1> LogIn Here:</h1>
                <p>  Username : <input type="text" name="username" id="username" placeholder="username"/></br></p>
                <p>Password : <input type="password" name="password" id="password" placeholder="password"/></br></p>
                <p class="submit"><button name="login" id="login">Login</button> </p>
                
            </div>
                <div class="login_help">
                    <p>forgot password ?&nbsp;&nbsp;<a href="retrive_pass.jsp">reset your password</a></p>
                    
                </div>
            <div id="messageDiv" style="display:none;"></div>
        </center>
        <script>
            $("#login").on('click', function(){
                var username = $("#username").val();
                var password = $("#password").val();
                if(username === ""){
                    $('#messageDiv').css("display","none");
                    alert("Username is required");
                    return;
                }
                if(password === ""){
                    $('#messageDiv').css("display","none");
                    alert("Password is required");
                    return;
                }
                $.ajax({
                    url : 'LoginServlet',
                    method : 'post',
                    data : {
                        username : username,
                        password : password
                    },
                    success : function(results){
                       
                        if(results !== null && results !== ""){
                            showMessage(results);
                            $('#messageDiv').css("display","block");
                             $('.container_login').load("table.jsp");
                        }else{
                            $('#messageDiv').css("display","none");
                            $('#messageDiv').html("");
                            alert("Some exception occurred! Please try again.");
                        }
                    },
                    error: function(){alert("error in ajax");}
                    
                });
            });
             
            //function to display message to the user
            function showMessage(results){
                if(results === 'SUCCESS'){
                    $('#messageDiv').html("<font color='green'>You are successfully logged in. </font>");
                }else if(results === 'FAILURE'){
                    $('#messageDiv').html("<font color='red'>Username or password incorrect </font>");
                }
            }
        </script>
        </div>
    </body>
</html>