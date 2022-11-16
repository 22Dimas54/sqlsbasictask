package ru.netology.sqlsasictask;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private ShopRepository shopRepository = new ShopRepository(namedParameterJdbcTemplate);

    public String handler(String name) {
        return shopRepository.answer(name);
    }
}
