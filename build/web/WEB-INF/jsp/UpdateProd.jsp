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
        <f:form action="UpdateProd.htm" commandName="prod" >
            Ma CT San Pham<f:input path="productDetailId" readonly="true" ></f:input>
            Mau<f:input path="color" ></f:input>
            Ma San Pham<f:input path="product" ></f:input>
            Rom<f:input path="rom" ></f:input>
            link Anh<f:input path="imagesLink" ></f:input>
            ngay tao<f:input path="created" ></f:input>
            Chiet Khau<f:input path="discount" ></f:input>
            viewPro<f:input path="viewPro" ></f:input>
            Gia ban<f:input path="price" ></f:input>
            status<f:input path="productStatus" ></f:input>
            So luong con<f:input path="quantity" ></f:input>
            <input type="submit" value="Cap Nhat" />
            
        </f:form>
    
    </body>
</html>
