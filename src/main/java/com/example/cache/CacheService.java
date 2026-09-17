package com.example.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    @Cacheable(value = "portfolio", key = "#id")
    public String getPortfolioData(String id) {
        // Simular una consulta a la base de datos
        return "Data for portfolio with id: " + id;
    }

    @CachePut(value = "portfolio", key = "#id")
    public String updatePortfolioData(String id, String data) {
        // Simular una actualización en la base de datos
        return data;
    }
}