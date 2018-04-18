<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GoMule Rides dashboard</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/webjars/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/navbar.css">

</head>
<body>

	<div class="container">
		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">GoMules Rides</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Rides</a></li>
					<li><a href="#">Post A Ride</a></li>

				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Your Account <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Profile</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Log Out</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
		</nav>
		<jsp:doBody />
	</div>
	<script
		src="${pageContext.request.contextPath}/webjars/jquery/2.1.4/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>