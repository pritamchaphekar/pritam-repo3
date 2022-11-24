
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%                                

LocalDate a = LocalDate.now();

%>

<h1>Today's date <%= a %></h1>
<center>
    <%
       for(int i=2; i<= 6; i++) {
    %>
       <font size="<%= i %>">Hello world</font><br />
       <%
       }
       %>
</center>

<center>
    <%
        for(int i = 1; i <=10 ; i++){
    %>
    <h3> 3 * <%= i %> = <%= 3*i %></h3>
    <%
        }
    %>
    </center>
    
    
    
    
    
    
    <center>
    <%
        for(int i = 2; i <=10 ; i++){
    %>
    <h3> 2 * <%= i %> = <%= 2*i %></h3>
    <%@page import="java.time.LocalDate"%><%
        }
    %>
    </center>

</body>
</html>