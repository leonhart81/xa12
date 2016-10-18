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
});
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
					<div class="row" style="margin-left: 3vw; margin-right: 3vw;">
						<div class="col-md-3">
							<div class="form-group label-floating">
								<label for="Country" class="control-label">Country:</label> <input
									id="Country" name="country" class="form-control" type="text">
								<p class="help-block">Input the country's name.</p>
							</div>
						</div>
						<div class="col-md-3 col-md-offset-1">
							<div class="form-group label-floating">
								<label for="City" class="control-label">City:</label> <input
									id="City" name="city" class="form-control" type="text">
								<p class="help-block">Input the city's name.</p>
							</div>
						</div>
						<div class="col-md-3 col-md-offset-1">
							<div class="form-group label-floating">
								<label for="Area" class="control-label">Area:</label> <input
									id="Area" name="area" class="form-control" type="text">
								<p class="help-block">Input the area's name.</p>
							</div>
						</div>
					</div>
					<div class="form-group has-warning">
						<label for="Email" class="control-label col-md-2" style="font-size: 20px; margin-top:5px;">Your Email:</label>
						<div class="col-md-4"><input id="Email" name="email" class="form-control" type="email" placeholder="Email"></div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>