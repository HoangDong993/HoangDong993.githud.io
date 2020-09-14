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
        <title>DS CT San Pham</title>
    </head>
    <body>
         <table border="1">
            <thead>
            <td>Ma CT San Pham</td>
            <td>Mau</td>
            <td>Ma San Pham</td>
            <td>Rom</td>
            <td>link Anh</td>
            <td>ngay tao</td>
            <td>Chiet Khau</td>
            <td>viewPro</td>
            <td>Gia ban</td>
            <td>status</td>
            <td>So luong con</td>
            <td>Action</td>
            <td>More Action</td>
            </thead>
            <c:forEach items="${ListProd}" var="prod">
            <tbody>
                
            <td>${prod.productDetailId}</td>
            <td>${prod.color}</td>
            <td>${prod.product}</td>
            <td>${prod.rom}</td>
            <td>${prod.imagesLink}</td>
            <td>${prod.created}</td>
            <td>${prod.discount}</td>
            <td>${prod.viewPro}</td>
            <td>${prod.price}</td>
            <td>${prod.productStatus}</td>
            <td>${prod.quantity}</td>

            <td></td>
            <td>
                <a href="DeleteProdById.htm?ProdId=${prod.productDetailId}" >Xoa</a> /
                <a href="InitUpdateProd.htm?ProdId=${prod.productDetailId}" >Cap Nhat</a> 
                
            </td>
            
            </tbody>
            </c:forEach>
        </table>
                
                <a href="InitInsertProd.htm" > Them CT San Pham</a>
        
                
               
    </body>
</html>
