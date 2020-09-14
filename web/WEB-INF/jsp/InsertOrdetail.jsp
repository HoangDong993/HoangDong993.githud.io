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
        <f:form action="InsertOrdetail.htm" commandName="ordetai" >
           Ma CT Don Hang <f:input path="orderDetailId"  ></f:input>
           Ma Don Hang <f:input path="orderPro" ></f:input>
           CT San Pham <f:input path="productDetail" ></f:input>
           NSo Luong <f:input path="quantity" ></f:input>
           Thanh Tien <f:input path="amount" ></f:input>
           Status <f:input path="detailStatus" ></f:input>
          
            <input type="submit" value="Them" />
            
            
        </f:form>
    </body>
</html>
