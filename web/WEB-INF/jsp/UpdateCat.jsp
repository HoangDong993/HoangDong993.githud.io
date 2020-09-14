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
        <title>Trang Update Danh Muc</title>
    </head>
    <body>
        <f:form action="UpdateCat.htm" commandName="cat" >
            <f:input path="categoryId" readonly="true" ></f:input>
            <f:input path="categoryName" ></f:input>
            <f:input path="priotityCategory" ></f:input>
            <f:input path="descriptions" ></f:input>
            <f:input path="parentId" ></f:input>
            <f:input path="catStatus" ></f:input>
            <input type="submit" value="Cap Nhat" />
            
        </f:form>
    
    </body>
</html>
