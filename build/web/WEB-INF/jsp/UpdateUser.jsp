<%-- 
    Document   : UpdateCat
    Created on : Sep 11, 2020, 6:11:30 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang Update Khach Hangc</title>
    </head>
    <body>
        <f:form action="UpdateUser.htm" commandName="user" >
           Ma Khach Hang <f:input path="userId" readonly="true" ></f:input>
           Ten Kahch Hang <f:input path="userName" ></f:input>
           MK <f:input path="passUser" ></f:input>
           Gioi Tinh <f:input path="sexAdmin" ></f:input>
           Mail <f:input path="mail" ></f:input>
           SDT <f:input path="phone" ></f:input>
           Dia Chi <f:input path="addresss" ></f:input>
           Status <f:input path="userStatus" ></f:input>
            <input type="submit" value="Cap Nhat" />
            
        </f:form>
    
    </body>
</html>
