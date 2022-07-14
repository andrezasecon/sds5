package com.andrezasecon.dsmeta.service;

import com.andrezasecon.dsmeta.entity.Sale;
import com.andrezasecon.dsmeta.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();
    }


}
