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
        <title>Them Anh</title>
    </head>
    <body>
        <f:form action="InsertImage.htm" commandName="image" >
           Ma Anh <f:input path="imagesId"  ></f:input>
           Ma CT San Pham <f:input path="productDetail" ></f:input>
           Link Anh <f:input path="imagesLink" ></f:input>   
           Status <f:input path="imagesStatus" ></f:input>   
            <input type="submit" value="Them" />
            
            
        </f:form>
    </body>
</html>
