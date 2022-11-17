package ru.netology.sqlsasictask.service;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import ru.netology.sqlsasictask.repository.DaoRepository;

@Service
public class DaoService {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private DaoRepository shopRepository = new DaoRepository(namedParameterJdbcTemplate);

    public String handlerService(String name) {
        return shopRepository.answer(name);
    }
}