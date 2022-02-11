package ru.netology.homeworkjdata3.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.homeworkjdata3.service.MyService;

@RestController
public class MyController {
    MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam(value = "name") String name) {
        return myService.getProductName(name);
    }

}
