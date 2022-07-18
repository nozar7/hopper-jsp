<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Web Hopper</title>
</head>
<body>
<h2>Resumen de compra de Hopper</h2>

<h3>Customer Name: <c:out value="${nombre}"></c:out> </h3>
<h4>Item Name: <c:out value="${item}"></c:out> </h4>
<h4>Price: <c:out value="${precio}"></c:out> </h4>
<h4>Descripcion: <c:out value="${descripcion}"></c:out> </h4>
<h4>Vendedor: <c:out value="${vendedor}"></c:out> </h4>


<h2>Resumen de compra de Rolin</h2>

<h3>Customer Name: <c:out value="${arrProducto.get(0)}"></c:out> </h3>
<h4>Item Name: <c:out value="${arrProducto.get(1)}"></c:out> </h4>
<h4>Price: <c:out value="${arrProducto.get(2)}"></c:out> </h4>
<h4>Descripcion: <c:out value="${arrProducto.get(3)}"></c:out> </h4>
<h4>Vendedor: <c:out value="${arrProducto.get(4)}"></c:out> </h4>

<h2>Resumen de compra de Nozari 7</h2>

<h3>Customer Name: <c:out value="${ventaName}"></c:out> </h3>


</body>
</html>