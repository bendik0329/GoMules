
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:landing>


	<c:if test="${message}">
		<div class="alert alert-danger">
			<a href="#" class="close" data-dismiss="alert" aria-label="close"
				title="close">×</a> <strong>Error!</strong> Login failed !!
		</div>
	</c:if>

	<c:url var="register_url" value="/registration/register" />
	<form:form id="login-form" method="POST" action="${register_url}"
		role="form" style="display: block;" modelAttribute="RegistrationModel">

		<div class="form-group">
			<input type="text" name="firstName" id="firstName" tabindex="1"
				class="form-control" placeholder="First Name" value=""
				maxlength="50" required autofocus />
		</div>
		<div class="form-group">
			<input type="text" name="lastName" id="lastName" maxlength="50"
				tabindex="2" class="form-control" placeholder="Last Name" value=""
				required autofocus />
		</div>
		<div class="form-group">
			<input type="email" name="email" id="email" tabindex="3"
				maxlength="50" class="form-control" placeholder="Email" value=""
				required autofocus />
		</div>
		<div class="form-group">
			<input type="password" name="userPassword" id="userPassword"
				tabindex="3" class="form-control" placeholder="User Password"
				minlength="4" maxlength="10" value="" required autofocus />
		</div>
		<div class="form-group">
			<input type="password" id="confirm_password" tabindex="4"
				minlength="4" maxlength="10" required autofocus class="form-control"
				placeholder="Confirm Password" value="" />
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

	<script type="text/javascript">
		var password = document.getElementById("userPassword"), confirm_password = document
				.getElementById("confirm_password");

		function validatePassword() {
			if (password.value != confirm_password.value) {
				confirm_password.setCustomValidity("Passwords Don't Match");
			} else {
				confirm_password.setCustomValidity('');
			}
		}

		password.onchange = validatePassword;
		confirm_password.onkeyup = validatePassword;
	</script>
</t:landing>