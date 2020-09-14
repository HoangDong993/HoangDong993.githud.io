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
            <td>Ma Don Hang</td>
            <td>kieu ship</td>
            <td>khach hang</td>
            <td>ngay tao</td>
            <td>so luong</td>
            <td>chi tiet</td>
            <td>Status</td>
            </thead>
            
            <c:forEach items="${ListOrder}" var="order">
            <tbody>
                
            <td>${order.orderId}</td>
            <td>${order.shipType}</td>
            <td>${order.users}</td>
            <td>${order.created}</td>
            <td>${order.totalAmount}</td>
            <td>${order.orderDetail}</td>
            <td>${order.orderStatus}</td>
            
            <td>
                <a href="DeleteOrderById.htm?orderId=${order.orderId}" >Xoa</a> /
                <a href="InitUpdateOrder.htm?orderId=${order.orderId}" >Cap Nhat</a> 
            </td>
            
            </tbody>
            </c:forEach>
        </table>
  
        <a href="InitInsertOrder.htm" > Them Order</a>
        
    </body>
</html>
