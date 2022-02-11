package ru.netology.homeworkjdata3.service;

import org.springframework.stereotype.Service;
import ru.netology.homeworkjdata3.repository.MyRepository;

@Service
public class MyService {
    MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String getProductName(String name) {
        return myRepository.getProductName(name);
    }
}
