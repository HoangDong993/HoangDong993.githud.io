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
            <td>Ma Danh muc</td>
            <td>Ten Danh Muc</td>
            <td>uu tie</td>
            <td>Mo Ta</td>
            <td>Lop cha</td>
            <td>status</td>
            <td>Action</td>
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
            <td><a href="ProductController/GetProByCat.htm?catId=${cat.categoryId}">Lay Danh sach san pham</a></td>
            <td>
                <a href="DeleteCatById.htm?catId=${cat.categoryId}" >Xoa</a> /
                <a href="InitUpdateCat.htm?catId=${cat.categoryId}" >Cap Nhat</a> 
                
            </td>
            
            </tbody>
            </c:forEach>
        </table>
        <a href="InitInsertCat.htm" > Them Danh Muc</a>
        <form action="GetCatByName.htm?CatName">
            <input type="text"  />
            <input type="submit" value="Tim" />
        </form>
    </body>
</html>
