
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container mt-5">
		<div class="row">

			<div class="col-md-6">
				<ul class="list-group">
					<li class="list-group-item"><a href="ProductListServlet">Xem
							danh sách</a></li>
					<li class="list-group-item"><a href="XuLyThem">Thêm sản
							phẩm</a></li>
					<li class="list-group-item"><a href="ProductListServlet">Cập
							nhật sản phẩm</a></li>
					<li class="list-group-item"><a href="ProductListServlet">Xóa
							sản phẩm</a></li>
					<li class="list-group-item"><a href="XuLyTK">Tìm kiếm sản
							phẩm</a></li>

				</ul>
			</div>
		</div>
	</div>

</body>
</html>