package com.example.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CacheServiceTest {

    @Autowired
    private CacheService cacheService;

    @Test
    void testCache() {
        String id = "123";
        String data = cacheService.getPortfolioData(id);
        assertEquals("Data for portfolio with id: 123", data);
        cacheService.updatePortfolioData(id, "Updated data");
        assertEquals("Updated data", cacheService.getPortfolioData(id));
    }
}