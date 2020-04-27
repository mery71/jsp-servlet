<%@page import="dao.ProductDAO"%>
<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cập nhật thông tin sản phẩm</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<form action="XuLySua" method="post">
		<%
			int ID = Integer.parseInt(request.getParameter("Id"));
		Product product = ProductDAO.getProductId(ID);
		%>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<label for="text">Mã:</label> <input type="text"
							class="form-control" value="<%=product.getId()%>"
							placeholder="Mã sản phẩm" name="prid" readonly>
					</div>
					<div class="form-group">
						<label for="text">Tên sản phẩm:</label> <input type="text"
							class="form-control" value="<%=product.getName()%>"
							placeholder="Tên sản phẩm" name="prname" required>
					</div>
					<div class="form-group">
						<label for="text">Số lượng:</label> <input type="number"
							class="form-control" value="<%=product.getQuantity()%>"
							placeholder="Số lượng" name="prquantity" required>
					</div>
					<div class="form-group">
						<label for="text">Đơn giá:</label> <input type="number"
							class="form-control" value="<%=product.getPrice()%> "
							placeholder="giá" name="prprice" required>
					</div>

					<button type="submit" class="btn btn-primary">Cập nhật</button>
				</div>
			</div>
		</div>

	</form>
</body>
</html>