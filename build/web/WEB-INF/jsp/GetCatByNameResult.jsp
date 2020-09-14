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
            <td>Ma Danh muc</td>
            <td>Ten Danh Muc</td>
            <td>uu tie</td>
            <td>Mo Ta</td>
            <td>Lop cha</td>
            <td>status</td>
            <td>More Action</td>
            </thead>
            
            <c:forEach items="${ListCat}" var="cat">
            <tbody>
                
            <td>${cat.categoryId}</td>
            <td>${cat.categoryName}</td>
            <td>${cat.priotityCategory}</td>
            <td>${cat.descriptions}</td>
            <td>${cat.parentId}</td>
            <td>${cat.catStatus}</td>
            <td>
                <a href="DeleteCatById.htm?catId=${cat.categoryId}" >Xoa</a> /
                <a href="InitUpdateCat.htm?catId=${cat.categoryId}" >Cap Nhat</a> 
            </td>
            
            </tbody>
            </c:forEach>
        </table>
    </body>
</html>
