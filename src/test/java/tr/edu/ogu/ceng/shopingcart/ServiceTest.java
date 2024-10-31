package tr.edu.ogu.ceng.shopingcart;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.service.CartService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest {
    static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));
    @Autowired
    CartService cartService;

    @Before
    public void setup() {

        testContainer.start();

    }


    @Test
    public void test(){
        Cart cart =new Cart();
        cartService.saveCart(cart);

    }


}
