package com.oauth.oauthgoogle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class OauthgoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthgoogleApplication.class, args);
	}

}
