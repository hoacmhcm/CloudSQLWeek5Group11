<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Tạo bài viết</title>
<jsp:include page="_style.jsp"></jsp:include>
<script src="//cdn.ckeditor.com/4.6.2/standard/ckeditor.js"></script>
</head>
<body>
	<jsp:include page="_navbar.jsp"></jsp:include>
	<div class="container">
		<form method="POST" action="save-post">
			<div class="form-group">
				<label for="title">Tiêu đề bài viết</label> <input type="text"
					class="form-control" id="title" name="title"
					placeholder="Tiêu đề bài viết">
			</div>

			<div class="form-group">
				<label for="content">Nội dung bài viết</label>
				<textarea type="text" class="form-control" id="content"
					name="content" placeholder="Nội dung bài viết">
				</textarea>
			</div>

			<button type="submit" class="btn btn-default">Lưu bài viết</button>
		</form>
	</div>

	<script type="text/javascript">
		// Replace the <textarea id="editor1"> with a CKEditor
		// instance, using default configuration.
		CKEDITOR.replace('content');
	</script>
</body>
</html>