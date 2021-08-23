package at.portfolio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	
	@GetMapping("/messagecenter")
	public String viewMasages() {	
	return "message-center";
	}
	
	
}
