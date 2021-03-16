package fon.master.nst.productservice.config;

import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer.UserDetailsBuilder;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;



public class CurrUser {

	
	public String getUser() {
		
		String usDet=  (String) SecurityContextHolder.getContext().getAuthentication().getName();
		 return usDet;
	}
	
}
