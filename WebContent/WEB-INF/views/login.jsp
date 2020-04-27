<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h2>Nhập thông tin đăng nhập</h2>
		<form class="form-horizontal" action="XuLyDangNhap" method="post">
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Tài khoản:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="email" name="username"
						placeholder="ví dụ: abc123">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="pwd">Mật khẩu:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pwd" name="pass"
						placeholder="Nhập mật khẩu ...">
				</div>
			</div>
			<div class="form-group">

				<input type="submit" value="Đăng nhập" class="btn btn-info" />
				<button name="button" value="Đăng ký" type="button"
					class="btn btn-success">
					<a href="XuLyDangKy">Đăng ký</a>
				</button>
			</div>
		</form>
	</div>

	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

</body>
</html>