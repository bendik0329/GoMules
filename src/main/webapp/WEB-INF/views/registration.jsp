
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:landing>

	<c:url var="register_url" value="/registration/register" />
	<form:form id="login-form" method="POST" action="${register_url}"
		role="form" style="display: block;" modelAttribute="RegistrationModel">

		<div class="form-group">
			<form:input path="firstName" tabindex="1" class="form-control"
				placeholder="First Name" value="" />
		</div>
		<div class="form-group">
			<form:input path="lastName" tabindex="2" class="form-control"
				placeholder="Last Name" value="" />
		</div>
				<div class="form-group">
			<form:input path="email" tabindex="3" class="form-control"
				placeholder="Email" value="" />
		</div>
		<div class="form-group">
			<form:password path="userPassword" tabindex="3" class="form-control"
				placeholder="User Password" value="" />
		</div>
				<div class="form-group">
			<input type="password" tabindex="4" class="form-control" placeholder="Confirm Password" value="" />
		</div>
			<div class="form-group">
		<div class="row">
			<div class="col-sm-6 col-sm-offset-3">
				<input type="submit" name="login-submit" id="login-submit"
					tabindex="4" class="form-control btn btn-login" value="Register">
			</div>
		</div>
	</div>
	</form:form>
</t:landing>