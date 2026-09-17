package com.example.cache;import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;import static org.junit.jupiter.api.Assertions.*;@SpringBootTest
class CacheServiceTest {

@Autowired
private CacheService cacheService;

@Autowired
private CacheManager cacheManager;

@Test
void testCacheOperations() {
    String id = "123";

    // 1. Initial retrieval (Cache Miss -> Stored in Cache)
    String data1 = cacheService.getPortfolioData(id);
    assertEquals("Data for portfolio with id: 123", data1);
    assertNotNull(cacheManager.getCache("portfolio").get(id));

    // 2. Second retrieval (Cache Hit)
    String data2 = cacheService.getPortfolioData(id);
    assertEquals(data1, data2);

    // 3. Cache Update (@CachePut)
    String updatedData = "Updated portfolio data";
    cacheService.updatePortfolioData(id, updatedData);
    assertEquals(updatedData, cacheManager.getCache("portfolio").get(id).get());

    // 4. Cache Eviction (@CacheEvict)
    cacheService.deletePortfolioData(id);
    assertNull(cacheManager.getCache("portfolio").get(id));
}


}