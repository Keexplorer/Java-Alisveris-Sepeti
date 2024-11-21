package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import tr.edu.ogu.ceng.shopingcart.entity.Category;
import tr.edu.ogu.ceng.shopingcart.repository.CategoryRepository;

@SpringBootTest
public class TestCategoryRepository {
    static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
    @Autowired
    CategoryRepository repository;
    static {
        testContainer.start();
    }
    @Test
    void test(){
        Category category = new Category();
        category.setName("q");
        repository.save(category);
    }

    @DynamicPropertySource


    static void configureProperties(DynamicPropertyRegistry registry) {


        registry.add("spring.datasource.url", testContainer::getJdbcUrl);


        registry.add("spring.datasource.username", testContainer::getUsername);


        registry.add("spring.datasource.password", testContainer::getPassword);


        registry.add("spring.data.redis.host", testContainer::getHost);

    }
}
