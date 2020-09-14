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
        <title>Them Danh Muc</title>
    </head>
    <body>
        <f:form action="InsertCat.htm" commandName="cat" >
           Ma <f:input path="categoryId"  ></f:input>
           Ten <f:input path="categoryName" ></f:input>
            uu tien <f:input path="priotityCategory" ></f:input>
            Mo ta <f:input path="descriptions" ></f:input>
            DM cha <f:input path="parentId" ></f:input>
            Trang thái <f:input path="catStatus" ></f:input>
            <input type="submit" value="Them" />
            
            
        </f:form>
    </body>
</html>
