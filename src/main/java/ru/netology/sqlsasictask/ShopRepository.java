package ru.netology.sqlsasictask;

import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ShopRepository {
    private final String SCRIPT_FILE_NAME = "myScript.sql";
    private String script;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public ShopRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.script = read(SCRIPT_FILE_NAME);
    }

    public String answer(String name) {
        try {
            Product product = namedParameterJdbcTemplate.queryForObject(script,
                    Map.of("namePerson", name),
                    (rs, rowNum) -> new Product(rs.getString("product_name")));
            return product.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "not found product";
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
