<%-- 
    Document   : ShowAllCategory
    Created on : Sep 10, 2020, 8:19:05 AM
    Author     : asus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>all cate</title>
    </head>
    <body>
        <table border="1">
            <thead>
            <td>Ma Khach</td>
            <td>Ten Khach</td>
            <td>Mat Kau</td>
            <td>Gioi Tinh</td>
            <td>Mail</td>
            <td>SDT</td>
            <td>Dia Chi</td>
            <td>Status</td>
            <td>Action</td>
            <td>More Action</td>
            </thead>
            <c:forEach items="${ListUser}" var="user">
            <tbody>
                
            <td>${user.userId}</td>
            <td>${user.userName}</td>
            <td>${user.passUser}</td>
            <td>${user.sexAdmin}</td>
            <td>${user.mail}</td>
            <td>${user.phone}</td>
            <td>${user.addresss}</td>
            <td>${user.userStatus}</td>
            
            
            <td>
                <a href="" >Block</a> /
                <a href="InitUpdateUser.htm?catId=${user.userId}" >Cap Nhat</a> 
                
            </td>
            
            </tbody>
            </c:forEach>
        </table>
        <a href="InitInsertUser.htm" > Them Khach Hang</a>
        
    </body>
</html>
