package kz.microservice.eurekaclient.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("api/home/v1/")
public class HomeController {

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable(name = "name") String name) {
        return name + ",Hello!";
    }

}
