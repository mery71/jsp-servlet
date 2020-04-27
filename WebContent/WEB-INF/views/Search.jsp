<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tìm kiếm sản phẩm</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<form action="XuLyTK" method="get" class="form-inline my-2 my-lg-3">
		<input type="text" name="name" class="form-control mr-sm-2"
			type="search" placeholder="Tìm theo tên">
		<button class="btn btn-info" type="submit">Tìm kiếm</button>
	</form>
	<table class="table table-hover">

		<tr>
			<th>Mã</th>
			<th>Tên sản phẩm</th>
			<th>Số lượng</th>
			<th>Giá</th>
			<th></th>
			<th></th>
		</tr>
		<tbody>

			<%
				ArrayList<Product> pro = (ArrayList<Product>) request.getAttribute("products");
			if (pro != null) {
				for (Product product : pro) {
			%>
			<tr>
				<td><%=product.getId()%></td>
				<td><%=product.getName()%></td>
				<td><%=product.getQuantity()%></td>
				<td><%=product.getPrice()%></td>
				<td><button class="btn-btn-sm btn-success"
						onclick="onEdit(<%=product.getId()%>)">Sửa</button></td>
				<td><button class="btn-btn-sm btn-danger"
						onclick="onDelete(<%=product.getId()%>)">Xóa</button></td>

			</tr>
			<%
				}
			}
			%>
		</tbody>
	</table>
	<script>
		function onDelete(id){
			if(confirm("Ban muon xoa du lieu?")){
				window.location.href = "XuLyXoa?Id=" + id;
			}
		}
		
		function onEdit(id){
			window.location.href = "XuLySua?Id=" + id;
		}
	</script>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
</body>
</html>