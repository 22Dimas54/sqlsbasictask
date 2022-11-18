package ru.netology.sqlsasictask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sqlsasictask.service.DaoService;

@RestController
public class DaoController {
    @Autowired
    private DaoService daoService;

    @GetMapping("/products/fetch-product")
    public String handlerController(@RequestParam("name") String name) {
        return daoService.handlerService(name);
    }
}
