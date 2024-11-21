package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.CartRepository;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;

@SpringBootTest
public class TestCartRepository {
    static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
    @Autowired
    CartRepository repository;
    static {
        testContainer.start();
    }
    @Test
    public void test(){
        Cart cart = new Cart();
        repository.save(cart);
    }
    @DynamicPropertySource


    static void configureProperties(DynamicPropertyRegistry registry) {


        registry.add("spring.datasource.url", testContainer::getJdbcUrl);


        registry.add("spring.datasource.username", testContainer::getUsername);


        registry.add("spring.datasource.password", testContainer::getPassword);


        registry.add("spring.data.redis.host", testContainer::getHost);

    }
}
