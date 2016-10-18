<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>探索世界</title>
<jsp:include page="styles_frameworks.jsp"></jsp:include>
<script type="text/javascript">
$.material.init();
</script>
<script type="text/babel">
      ReactDOM.render(
        <h3 class="panel-title">Hello, world!</h3>,
        document.getElementById("example")
      );
</script> 
</head>
<body>
	<button id="hello_jquery" class="btn btn-raised btn-primary"
		onclick="swal('Hello, world!')"><span class="glyphicon glyphicon-thumbs-up"></span> hello</button>
	<ul class="pager">
		<li><a class="withripple" href="javascript:void(0)">Previous</a></li>
		<li><a class="withripple" href="javascript:void(0)">Next</a></li>
	</ul>
	<div class="container">
		<div class="well">
			<div class="alert alert-dismissible alert-success">
				<button type="button" class="close" data-dismiss="alert">×</button>
				<strong>Well done!</strong> You successfully read <a
					href="javascript:void(0)" class="alert-link">this important
					alert message</a>.
			</div>
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3>Panel content</h3>
				</div>
				<div class="panel-body">Panel content</div>
			</div>
			<div class="panel panel-primary">
				<div id="example" class="panel-heading"></div>
				<div class="panel-body">Panel content</div>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="well">
			<form class="form-horizontal" onsubmit="return false;">
				<fieldset>
					<div class="form-group">
						<label for="name" class="control-label">Name:</label>
						<input id="name" class="form-control" type="text">
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>