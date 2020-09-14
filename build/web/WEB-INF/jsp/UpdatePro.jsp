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
        <f:form action="UpdatePro.htm" commandName="cat" >
            Ma <f:input path="productId"  ></f:input>
           Ten <f:input path="category" ></f:input>
            uu tien <f:input path="productName" ></f:input>
            Mo ta <f:input path="title" ></f:input>
            DM cha <f:input path="descriptions" ></f:input>
            Trang thái <f:input path="productStatus" ></f:input>
            <input type="submit" value="Cap Nhat" />
            
        </f:form>
    
    </body>
</html>
