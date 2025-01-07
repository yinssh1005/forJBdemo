package f.j.d.demo_in_tc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    public static final String WELCOME_MESSAGE = "welcome to our app！";

    @GetMapping("/welcome")
    public String welcome() {
        return WELCOME_MESSAGE;
    }
}