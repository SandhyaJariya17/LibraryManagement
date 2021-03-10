<%-- 
    Document   : AddStudent
    Created on : 11 Mar, 2021, 2:09:30 AM
    Author     : 1711j
--%>

<%@page import="Util.SqlUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% try {
          
            SqlUtil.connectDB();
            %>
            
        <b> ENTER DETAILS TO ADD NEW STUDENT </b><br> <br>
        <form action="AddStudentController">
            <input type="text" placeholder="enter id" name="id"> <br> <br>
            <input type="text" placeholder="roll" name="roll"> <br> <br>
            <input type="text" placeholder="enter name" name="name"> <br> <br>
            <input type="text" placeholder="enter branch id" name="bid"> <br> <br>
            <input type="text" placeholder="enter semNumber" name="semNumber"> <br> <br>
            <input type="submit" value="ADD">
        </form>
            
            
            
                    
                    
            
      <%  }
        catch(Exception e){
            System.out.println(e);
            }
        
        
        
        %>
    </body>
</html>
