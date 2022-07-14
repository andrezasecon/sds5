package com.andrezasecon.dsmeta.controller;

import com.andrezasecon.dsmeta.entity.Sale;
import com.andrezasecon.dsmeta.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    private SaleService service;

    @GetMapping
    public List<Sale> findAll(){
        return service.findSales();
    }
}
