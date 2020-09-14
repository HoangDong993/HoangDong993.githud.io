<%-- 
    Document   : ShowProduct
    Created on : Sep 12, 2020, 4:35:44 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table border="1">
            <thead>
            <td>Ma San Pham</td>
            <td>Ten Danh Muc</td>
            <td>Ten San Pham</td>
            <td>Title</td>
            <td>Mo Ta</td>
            <td>status</td>
            <td>Action</td>
            <td>More Action</td>
            </thead>
            <c:forEach items="${ListPro}" var="pro">
            <tbody>
                
            <td>${pro.productId}</td>
            <td>${pro.category}</td>
            <td>${pro.productName}</td>
            <td>${pro.title}</td>
            <td>${pro.descriptions}</td>
            <td>${pro.productStatus}</td>
            
            <td></td>
            <td>
                <a href="DeleteProById.htm?proId=${pro.productId}" >Xoa</a> /
                <a href="InitUpdatePro.htm?proId=${pro.productId}" >Cap Nhat</a> 
                
            </td>
            
            </tbody>
            </c:forEach>
        </table>
                
                <a href="InitInsertCat.htm" > Them Danh Muc</a>
        <form action="GetCatByName.htm?CatName">
            <input type="text"  />
            <input type="submit" value="Tim" />
    </body>
</html>
