<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Hello, I am a doctor. Unfortunately, there's no table in the database for me yet.</h2>
      <table>

         <tr>
            <td>ID</td>
            <td>${login_id}</td>
         </tr>
         <tr>
            <td>Password</td>
            <td>${password}</td>
         </tr>

      </table>  
   </body>
</html>