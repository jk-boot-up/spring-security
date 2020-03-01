package com.jk.explore.spring.security.secure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping("/foo")
    public String foo() {
        return "Welcome to Foo!!!";
    }

}
