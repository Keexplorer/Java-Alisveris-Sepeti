package tr.edu.ogu.ceng.shopingcart;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import tr.edu.ogu.ceng.shopingcart.entity.*;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.Collections;
@SpringBootTest
public class EntityTest {
    static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));

    static {
        testContainer.start();
    }
    @Test
    public void testEntityFields() {

        Category category = new Category();
        category.setName("k");

        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(2.4);
        product.setStockQuantity(10);

        Setting setting = new Setting();

        User user = new User();
        user.setUsername("k");
        user.setEmail("k");
        user.setPassword("k");

        Cart cart = new Cart();
        cart.setUser(user);

        CartItem cartItem = new CartItem();
        cartItem.setQuantity(2);
        cartItem.setCart(cart);
        cartItem.setProduct(product);

    }
    @DynamicPropertySource


    static void configureProperties(DynamicPropertyRegistry registry) {


        registry.add("spring.datasource.url", testContainer::getJdbcUrl);


        registry.add("spring.datasource.username", testContainer::getUsername);


        registry.add("spring.datasource.password", testContainer::getPassword);


        registry.add("spring.data.redis.host", testContainer::getHost);

    }
}
