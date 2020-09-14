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
        <title>Them Order</title>
    </head>
    <body>
        <f:form action="InsertOrder.htm" commandName="order" >
           Ma <f:input path="orderId"  ></f:input>
           Kieu Ship <f:input path="shipType" ></f:input>
           Khach Hang <f:input path="users" ></f:input>
           Ngay tao <f:input path="created" ></f:input>
           total amuont <f:input path="totalAmount" ></f:input>
           Order detail <f:input path="orderDetail" ></f:input>
           Status <f:input path="orderStatus" ></f:input>
            <input type="submit" value="Them" />
            
            
        </f:form>
    </body>
</html>
