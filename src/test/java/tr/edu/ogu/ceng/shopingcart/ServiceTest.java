package tr.edu.ogu.ceng.shopingcart;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.service.CartService;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Collections;
@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest {
    static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
    @Autowired
    CartService cartService;

    @BeforeEach
    public void setup() {
        if (!testContainer.isRunning()) {
            testContainer.start();
        }
    }


    @Test
    public void test(){
        Cart cart = new Cart();
        cart.setId(1L);
        // Save the cart to the database
        cartService.saveCart(cart);

    }

}
