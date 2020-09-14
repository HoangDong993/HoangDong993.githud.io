<%-- 
    Document   : GetCatByNameResult
    Created on : Sep 12, 2020, 3:29:37 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ket Qua Tim Danh Muc</title>
    </head>
    <body>
        <table border="1">
            <thead>
            <td>Ma CT Don Hang</td>
            <td>Ma Don Hang</td>
            <td>Ma CT San Pham</td>
            <td>So luong</td>
            <td>Thanh tien</td>
            <td>Status</td>
            
            </thead>
            
            <c:forEach items="${listOrdetail}" var="ordetail">
            <tbody>
                
            <td>${ordetail.orderDetailId}</td>
            <td>${ordetail.orderPro}</td>
            <td>${ordetail.productDetail}</td>
            <td>${ordetail.quantity}</td>
            <td>${ordetail.amount}</td>
            <td>${ordetail.detailStatus}</td>
            
           
            
            <td>
                <a href="DeleteOrdetailOrderId.htm?orderId=${ordetail.orderPro}" >Xoa</a> /
                
            
            </tbody>
            </c:forEach>
        </table>
                <a href="InitInsertOrdetail.htm">
                    Them CT Don Hang
                </a>
    </body>
</html>
