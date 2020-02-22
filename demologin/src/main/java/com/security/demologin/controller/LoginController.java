package com.security.demologin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {

	@GetMapping("/showMyLoginPage")
	  void handleFoo(HttpServletResponse response) throws IOException {
	    response.sendRedirect("http://localhost/login/");
	  }
}