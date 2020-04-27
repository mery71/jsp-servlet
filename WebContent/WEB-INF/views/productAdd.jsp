<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sản phẩm mới</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<form action="XuLyThem" method="post">
					<div class="form-group">
						<label for="prname">Tên sản phẩm:</label> <input type="text"
							class="form-control" placeholder="Nhập tên sản phẩm"
							name="prname" required id="prname">
					</div>
					<div class="form-group">
						<label for="quantity">Số lượng:</label> <input type="number"
							class="form-control" placeholder="Số lượng" name="quantity"
							required id="quantity">
					</div>
					<div class="form-group">
						<label for="price">Đơn giá:</label> <input type="number"
							class="form-control" placeholder="giá" name="price" required
							id="price">
					</div>

					<button type="submit" class="btn btn-primary">Thêm</button>

				</form>
			</div>
		</div>
	</div>

</body>
</html>