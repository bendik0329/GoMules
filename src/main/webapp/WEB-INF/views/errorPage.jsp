<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script
	src="${pageContext.request.contextPath}/webjars/jquery/2.1.4/jquery.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/webjars/bootstrap/3.2.0/css/bootstrap.min.css">
<script
	src="${pageContext.request.contextPath}/webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/login.css">
<title>Error Page</title>
</head>
<body>
<div class="jumbotron">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="error-template">
					<h1>Oops!</h1>
					<div class="error-details">${errorMsg}</div>
					<div class="error-actions">
						<a href="<c:url value='/'/>" class="btn btn-primary btn-lg"
							id="login-form-link"><span class="glyphicon glyphicon-home"></span>Take
							Me Home</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
</body>
</html>
