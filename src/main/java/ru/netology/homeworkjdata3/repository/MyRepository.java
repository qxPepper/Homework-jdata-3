package ru.netology.homeworkjdata3.repository;

import org.springframework.beans.factory.annotation.Autowired;
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
public class MyRepository {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private String myScript;

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProductName(String name) {
        myScript = read("myScript.sql");
        SqlRowSet sqlRowSet = namedParameterJdbcTemplate.queryForRowSet(myScript, Map.of("name", name));

        StringBuilder result = new StringBuilder();
        while (sqlRowSet.next()) {
            String surname = sqlRowSet.getString("product_name") + "\n";
            result.append(surname);
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
