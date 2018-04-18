<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<t:landing>

		<c:if test="${message}">
<div class="alert alert-success">
<a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">×</a>
  <strong>Success!</strong> User registered successfully !!
</div>
</c:if>

	<c:url var="post_url" value="/" />
	<form:form id="login-form" action="${post_url}"
		modelAttribute="loginModel" method="post" role="form"
		style="display: block;">
		<div class="form-group">
			<form:input path="email" tabindex="1" class="form-control"
				placeholder="User Email" value="" />
		</div>
		<div class="form-group">
			<form:password path="userPassword" tabindex="2" class="form-control"
				placeholder="Password" />
		</div>
		<div class="form-group">
			<div class="row">
				<div class="col-sm-6 col-sm-offset-3">
					<input type="submit" name="login-submit" id="login-submit"
						tabindex="4" class="form-control btn btn-login" value="Log In">
				</div>
			</div>
		</div>
	</form:form>
</t:landing>
