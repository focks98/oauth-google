package com.oauth.oauthgoogle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping
public class SocialLoginController {

    @GetMapping("/")
    public String home() {
        return "Welcome!";
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
