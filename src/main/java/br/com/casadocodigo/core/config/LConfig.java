package br.com.casadocodigo.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

@Configuration
@ImportResource("classpath:security-context.xml")
public class LConfig {

	@Autowired
	private Environment env;
	
}
