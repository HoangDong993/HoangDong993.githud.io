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
        <title>Them CT San Pham</title>
    </head>
    <body>
        <f:form action="InsertCat.htm" commandName="cat" >
           
            <f:input path="productDetailId"  ></f:input>
            <f:input path="color" ></f:input>
            <f:input path="product" ></f:input>
            <f:input path="rom" ></f:input>
            <f:input path="imagesLink" ></f:input>
            <f:input path="created" ></f:input>
            <f:input path="discount" ></f:input>
            <f:input path="viewPro" ></f:input>
            <f:input path="price" ></f:input>
            <f:input path="productStatus" ></f:input>
            <f:input path="quantity" ></f:input>
            <input type="submit" value="Cap Nhat" />
            
        </f:form>
    </body>
</html>
