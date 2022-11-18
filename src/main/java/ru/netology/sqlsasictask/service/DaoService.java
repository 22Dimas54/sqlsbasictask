package ru.netology.sqlsasictask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.netology.sqlsasictask.repository.DaoRepository;

@Service
public class DaoService {
    @Autowired
    private DaoRepository shopRepository;

    public String handlerService(String name) {
        return shopRepository.answer(name);
    }
}