<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${not empty error}">
	<br />
	<div class="alert alert-danger">
		Your login attempt was not successful, try again.<br /> Caused :
		${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
	</div>
</c:if>

<form class="form-signin" action="<c:url value='j_spring_security_check' />" method="post">
	
	<h2 class="form-signin-heading">Login</h2>
	
	<p>
	<input id="usuario" type="text" name="j_username" class="form-control" placeholder="Usuário" autofocus /> 
	</p>
	<p>	
	<input id="senha" type="password" name="j_password" class="form-control" placeholder="Senha" />
	</p> 
	<p>
	<button id="entrar" class="btn btn-lg btn-primary" type="submit">Entrar</button>
	</p>
</form>