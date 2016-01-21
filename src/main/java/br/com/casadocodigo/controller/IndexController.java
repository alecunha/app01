package br.com.casadocodigo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String index() {

		LOG.info("Calling index()");

		return "index";
	}
}
