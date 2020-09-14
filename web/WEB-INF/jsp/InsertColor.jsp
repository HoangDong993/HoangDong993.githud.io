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
        <title>Them Mau Sac</title>
    </head>
    <body>
        <f:form action="InsertColor.htm" commandName="co" >
           Ma Mau <f:input path="colorId"  ></f:input>
           Ten Mau <f:input path="colorName" ></f:input>
           Status <f:input path="colorStatus" ></f:input>   
            <input type="submit" value="Them" />
            
            
        </f:form>
    </body>
</html>
