package com.heggadahalli.webapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping("/")
    public String index() {
        return "Welcome to heggadahalli.com!";
    }

}
