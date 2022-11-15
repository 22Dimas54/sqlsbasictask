package ru.netology.sqlsasictask;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private ShopRepository shopRepository = new ShopRepository();
    public void handler(String name) {

    }
}
