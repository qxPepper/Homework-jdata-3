package ru.netology.homeworkjdata3.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.homeworkjdata3.service.MyService;
import java.util.List;

@RestController
public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam(value = "name") String name) {
        return myService.getProductName(name);
    }
}
