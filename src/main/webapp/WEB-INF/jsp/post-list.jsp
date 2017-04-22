<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Danh sách bài viết</title>
<jsp:include page="_style.jsp"></jsp:include>
</head>
<body>
	<jsp:include page="_navbar.jsp"></jsp:include>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Mã</th>
					<th>Tiêu đề</th>
					<th>Nội dung</th>
					<th>Hành động</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="post" items="${posts}">
					<tr>
						<td>${post.id}</td>
						<td>${post.title}</td>
						<td>${post.content}</td>
						<td><a href="/delete-post?id=${post.id}"
							class="btn btn-danger btn-sm">Xóa</a> <a href="/update-post?id=${post.id}"
							class="btn btn-primary btn-sm">Sửa</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>