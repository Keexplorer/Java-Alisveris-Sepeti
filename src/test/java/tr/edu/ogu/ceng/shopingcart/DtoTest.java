package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;
import tr.edu.ogu.ceng.shopingcart.dto.*;
import tr.edu.ogu.ceng.shopingcart.entity.*;

import java.time.LocalDateTime;
import java.util.Collections;
@SpringBootTest
public class DtoTest {
    static PostgreSQLContainer testContainer= new PostgreSQLContainer<>(DockerImageName.parse("postgres:16-alpine"));

    static {
        testContainer.start();
    }
    @Test
    public void testCartDtoFields() {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("k");

        ProductDto productDto = new ProductDto();
        productDto.setName("Laptop");
        productDto.setPrice(2.4);
        productDto.setStockQuantity(10);

        SettingDto settingDto = new SettingDto();

        UserDto userDto = new UserDto();
        userDto.setUsername("k");
        userDto.setEmail("k");
        userDto.setPassword("k");

        User user = new User();
        user.setUsername("k");
        user.setEmail("k");
        user.setPassword("k");

        CartDto cartDto = new CartDto();
        cartDto.setUser(user);

        Cart cart = new Cart();
        cart.setUser(user);

        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(2.4);
        product.setStockQuantity(10);

        CartItemDto cartItemDto = new CartItemDto();
        cartItemDto.setQuantity(2);
        cartItemDto.setCart(cart);
        cartItemDto.setProduct(product);
    }

    @DynamicPropertySource


    static void configureProperties(DynamicPropertyRegistry registry) {


        registry.add("spring.datasource.url", testContainer::getJdbcUrl);


        registry.add("spring.datasource.username", testContainer::getUsername);


        registry.add("spring.datasource.password", testContainer::getPassword);


        registry.add("spring.data.redis.host", testContainer::getHost);

    }
}
