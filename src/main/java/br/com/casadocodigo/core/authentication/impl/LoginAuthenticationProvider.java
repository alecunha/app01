package br.com.casadocodigo.core.authentication.impl;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import br.com.casadocodigo.core.entinty.User;


@Component
public class LoginAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

	@Override
	protected void additionalAuthenticationChecks(UserDetails arg0, UsernamePasswordAuthenticationToken arg1) throws AuthenticationException {
		
	}

	@Override
	protected UserDetails retrieveUser(String username, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

		User user = new User();
		if (authentication.getCredentials().toString().equals("123") && username.equals("admin")) {
			user.setUsername("admin");
			user.setPassword("123");
			return user;
		}
		
		throw new AuthenticationServiceException("Login/Senha inválidos");
	}

}
