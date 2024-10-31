package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.data.domain.jaxb.SpringDataJaxb;
import tr.edu.ogu.ceng.shopingcart.dto.*;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.entity.Product;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import java.time.LocalDateTime;
import java.util.Collections;

public class DtoTest {
    @Test
    public void testCartDtoFields() {
        CartDto cartDto = new CartDto();
        cartDto.setId(1L);
        cartDto.setCreatedAt(LocalDateTime.now());
        cartDto.setUpdatedAt(LocalDateTime.now());
        cartDto.setCreatedBy(1);
        cartDto.setUpdatedBy(2);
        cartDto.setDeletedBy(null);
        cartDto.setDeletedAt(null);
        cartDto.setCartItems(Collections.emptyList());
        cartDto.setUser(new User());

        assertNotNull(cartDto.getId());
        assertNotNull(cartDto.getCreatedAt());
        assertEquals(1, cartDto.getCreatedBy());

        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setUsername("testuser");
        userDto.setEmail("test@example.com");
        userDto.setPassword("password");
        userDto.setFirstName("Test");
        userDto.setLastName("User");
        userDto.setAddress("123 Test St");
        userDto.setCreatedAt(LocalDateTime.now());
        userDto.setUpdatedAt(LocalDateTime.now());
        userDto.setCreatedBy(1L);
        userDto.setUpdatedBy(2L);
        userDto.setDeletedBy(null);
        userDto.setDeletedAt(null);
        userDto.setVersion(1);

        assertNotNull(userDto);
        assertEquals("testuser", userDto.getUsername());
        assertEquals("test@example.com", userDto.getEmail());

        SettingDto settingDto = new SettingDto();
        settingDto.setId(1L);
        settingDto.setSettingKey("app.name");
        settingDto.setSettingValue("Shopping Cart");

        assertNotNull(settingDto);
        assertEquals("app.name", settingDto.getSettingKey());
        assertEquals("Shopping Cart", settingDto.getSettingValue());

        ProductDto productDto = new ProductDto();
        productDto.setId(1L);
        productDto.setName("Laptop");
        productDto.setDescription("A powerful laptop");
        productDto.setPrice(999.99);
        productDto.setStockQuantity(10);
        productDto.setImageUrl("http://example.com/laptop.png");
        productDto.setActive(true);
        productDto.setCreatedAt(LocalDateTime.now());
        productDto.setUpdatedAt(LocalDateTime.now());
        productDto.setCreatedBy(1L);
        productDto.setUpdatedBy(2L);
        productDto.setDeletedBy(null);
        productDto.setDeletedAt(null);
        productDto.setVersion(1);

        assertNotNull(productDto);
        assertEquals("Laptop", productDto.getName());
        assertEquals(999.99, productDto.getPrice());

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(1L);
        categoryDto.setName("Electronics");
        categoryDto.setCreatedAt(LocalDateTime.now());
        categoryDto.setUpdatedAt(LocalDateTime.now());
        categoryDto.setCreatedBy(1L);
        categoryDto.setUpdatedBy(2L);
        categoryDto.setDeletedBy(null);
        categoryDto.setDeletedAt(null);
        categoryDto.setVersion(1);

        assertNotNull(categoryDto);
        assertEquals("Electronics", categoryDto.getName());
        assertNotNull(categoryDto.getCreatedAt());

        CartItemDto cartItemDto = new CartItemDto();
        cartItemDto.setId(1L);
        Cart cart = new Cart();
        cart.setId(1L);
        cartItemDto.setCart(cart);
        Product product = new Product();
        product.setId(1L);
        cartItemDto.setProduct(product);
        cartItemDto.setQuantity(2);
        cartItemDto.setCreatedAt(LocalDateTime.now());
        cartItemDto.setUpdatedAt(LocalDateTime.now());
        cartItemDto.setCreatedBy(1L);
        cartItemDto.setUpdatedBy(2L);
        cartItemDto.setDeletedBy(null);
        cartItemDto.setDeletedAt(null);
        cartItemDto.setVersion(1);

        assertNotNull(cartItemDto);
        assertEquals(1L, cartItemDto.getId());
        assertEquals(2, cartItemDto.getQuantity());
        assertNotNull(cartItemDto.getCreatedAt());
    }
}
