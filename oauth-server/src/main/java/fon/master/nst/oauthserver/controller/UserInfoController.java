package fon.master.nst.oauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoController {
	
	
	@GetMapping("/info")
	public String hello() {
		
		return "Hi";
	}
	
}
