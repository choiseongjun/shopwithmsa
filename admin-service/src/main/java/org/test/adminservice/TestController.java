package org.test.adminservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin-service")
public class TestController {
    @GetMapping("/hello")
    public String hi(){
        return "hello";
    }
}
