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
        <title>Them Rom</title>
    </head>
    <body>
        <f:form action="InsertRom.htm" commandName="rom" >
           Ma Mau <f:input path="romId"  ></f:input>
           Ten Mau <f:input path="romName" ></f:input>
           Status <f:input path="romStatus" ></f:input>   
            <input type="submit" value="Them" />
            
            
        </f:form>
    </body>
</html>
