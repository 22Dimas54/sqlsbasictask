package ru.netology.sqlsasictask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private ShopRepository shopRepository;

    public String handler(String name) {
        return shopRepository.answer(name);
    }
}
