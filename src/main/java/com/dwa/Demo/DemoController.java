package com.dwa.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/demo/portada")
	public String Portada() {
		return "portada";
	}

}
