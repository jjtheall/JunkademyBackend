package com.csc492;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins={ "http://localhost:3000", "http://localhost:4200" })
@RestController
public class AuthController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticate() {
        return new AuthenticationBean("You are authenticated");
    }   
}

