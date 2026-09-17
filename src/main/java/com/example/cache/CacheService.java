package com.example.cache;import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;@Service
public class CacheService {

@Cacheable(value = "portfolio", key = "#id")
public String getPortfolioData(String id) {
    return "Data for portfolio with id: " + id;
}

@CachePut(value = "portfolio", key = "#id")
public String updatePortfolioData(String id, String data) {
    return data;
}

@CacheEvict(value = "portfolio", key = "#id")
public void deletePortfolioData(String id) {
}


}