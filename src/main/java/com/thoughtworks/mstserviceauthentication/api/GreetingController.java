package com.thoughtworks.mstserviceauthentication.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

    @Value("${user.name}")
    private String username;

    @GetMapping("/greeting")
    public String greet() {
        return String.format("Hello %s", username);
    }
}
