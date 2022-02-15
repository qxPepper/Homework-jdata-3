package ru.netology.homeworkjdata3.service;

import org.springframework.stereotype.Service;
import ru.netology.homeworkjdata3.repository.MyRepository;

import java.util.List;

@Service
public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public List<String> getProductName(String name) {
        return myRepository.getProductName(name);
    }
}
