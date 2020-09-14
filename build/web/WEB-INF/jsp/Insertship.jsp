<%-- 
    Document   : InsertCat
    Created on : Sep 11, 2020, 6:48:15 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Them Kieu Ship</title>
    </head>
    <body>
        <f:form action="Insertship.htm" commandName="ship" >
           Ma Ship <f:input path="shipId"  ></f:input>
           Ten Ship <f:input path="shipName" ></f:input>
           Phi Ship <f:input path="fees" ></f:input>   
           Status <f:input path="shipStatus" ></f:input>   
            <input type="submit" value="Them" />
            
            
        </f:form>
    </body>
</html>
