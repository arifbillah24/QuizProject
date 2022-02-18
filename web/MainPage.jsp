<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a, .dropbtn {
    display: inline-block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
    background-color: red;color:black;
}

li.dropdown {
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
    color:black;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: red}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>

</head>
<body>
<ul>
  <li><a href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Online Test</a>
    <div class="dropdown-content">
 
<s:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/parijat" user="root" password=""/>
  <s:query var="res" dataSource="${db}">
  select TopicName from topictable;
  </s:query>
  <c:forEach var="result" items="${res.rows}">
      <a href="Rules.jsp"><c:out value="${result.TopicName}"/></a>
 


</c:forEach></div>
</li>



<li class="dropdown"> 
    <a href="javascript:void(0)" class="dropbtn">Tutorials</a>

 <div class="dropdown-content">
 
<s:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/parijat" user="root" password=""/>
  <s:query var="res" dataSource="${db}">
  select Tutorials from TutorialTable;
  </s:query>
  <c:forEach var="result" items="${res.rows}">
       
     <a href="<c:out value="${result.Tutorials}"/>.jsp"><c:out value="${result.Tutorials}"/></a>
      
     
   </c:forEach></div>
   

 </li>

  <li><a href="singin.html">SignUp</a></li>
 
 </ul>
<h3>Dropdown Menu inside a Navigation Bar</h3>
<p>Hover over the "Dropdown" link to see the dropdown menu.</p>

</body>
</html>