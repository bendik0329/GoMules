<%@ tag language="java" pageEncoding="ISO-8859-1"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 
https://bootsnipp.com/snippets/featured/login-and-register-tabbed-form -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="${pageContext.request.contextPath}/webjars/jquery/2.1.4/jquery.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css">
<script src="${pageContext.request.contextPath}/webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<title>Login to GoMules</title>
</head>
<body>
<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-login">
					<div class="panel-heading">
					
					<div class="row">
							<div class="col-xs-12">
							
							<img style="    width: 200px;" src="${pageContext.request.contextPath}/resources/image/ucm.png" class="img-rounded" alt="Cinque Terre">
							
							</div>
						</div>
						<div class="row">
							<div class="col-xs-6">
								<a href="<c:url value='/'/>" class="active" id="login-form-link">Login</a>
							</div>
							<div class="col-xs-6">
								<a href="<c:url value='/registration/register'/>" id="register-form-link">Register</a>
							</div>
						</div>
						<hr>
					</div>
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-12">
							 <jsp:doBody/>
							 </div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

							 
