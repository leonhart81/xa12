<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>探索世界</title>
<jsp:include page="styles_frameworks.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready(function() {
	$.material.init();
	$("#hello_jquery").on("click", function() {
		swal("abc");
	});
})
</script>
</head>
<body>
<button id="hello_jquery" class="btn btn-raised btn-primary">hello</button>
</body>
</html>