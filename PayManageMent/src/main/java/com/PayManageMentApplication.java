package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class PayManageMentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayManageMentApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "redirect:list";
	}
	
}
