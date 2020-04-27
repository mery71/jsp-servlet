
<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hiển thị danh sách</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<h2>Danh sách sản phẩm</h2>


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
				for (Product item : ProductDAO.getProduct()) {
			%>
			<tr>
				<td><%=item.getId()%></td>
				<td><%=item.getName()%></td>
				<td><%=item.getQuantity()%></td>
				<td><%=item.getPrice()%></td>
				<td><button class="btn-btn-sm btn-success"
						onclick="onEdit(<%=item.getId()%>)">Sửa</button></td>
				<td><button class="btn-btn-sm btn-danger"
						onclick="onDelete(<%=item.getId()%>)">Xóa</button></td>

			</tr>
			<%
				}
			%>

		</tbody>

	</table>
	<ul>
		<li><a href="XuLyThem">Thêm sản phẩm mới</a></li>
	</ul>
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
</body>
</html>