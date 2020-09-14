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
        <title>Them Banner</title>
    </head>
    <body>
        <f:form action="InsertBanner.htm" commandName="ban" >
           Ma Banner <f:input path="bannerId"  ></f:input>
           Anh <f:input path="images" ></f:input>
           Ten Banner <f:input path="bannerName" ></f:input>   
           Link Anh <f:input path="bannerLink" ></f:input>   
           Status <f:input path="bannerStatus" ></f:input>   
            <input type="submit" value="Them" />
            
            
        </f:form>
    </body>
</html>
