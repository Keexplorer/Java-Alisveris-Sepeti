package tr.edu.ogu.ceng.shopingcart;
import org.junit.jupiter.api.Test;
import tr.edu.ogu.ceng.shopingcart.entity.*;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.util.Collections;

public class EntityTest {
    @Test
    public void testEntityFields() {
        Cart cart = new Cart();
        cart.setId(1L);
        cart.setCreatedAt(LocalDateTime.now());
        cart.setUpdatedAt(LocalDateTime.now());
        cart.setCreatedBy(1L);
        cart.setUpdatedBy(2L);
        cart.setDeletedBy(null);
        cart.setDeletedAt(null);
        cart.setCartItems(Collections.emptyList());

        assertNotNull(cart.getId());
        assertNotNull(cart.getCreatedAt());
        assertEquals(1L, cart.getCreatedBy());

        CartItem cartItem = new CartItem();
        cartItem.setQuantity(2);
        cartItem.setCreatedAt(LocalDateTime.now());
        cartItem.setUpdatedAt(LocalDateTime.now());
        cartItem.setCreatedBy(1L);
        cartItem.setUpdatedBy(2L);
        cartItem.setDeletedBy(null);
        cartItem.setDeletedAt(null);

        assertNotNull(cartItem);
        assertEquals(2, cartItem.getQuantity());
        assertNotNull(cartItem.getCreatedAt());

        Category category = new Category();
        category.setName("Electronics");
        category.setCreatedAt(LocalDateTime.now());
        category.setUpdatedAt(LocalDateTime.now());
        category.setCreatedBy(1L);
        category.setUpdatedBy(2L);
        category.setDeletedBy(null);
        category.setDeletedAt(null);

        assertNotNull(category);
        assertEquals("Electronics", category.getName());
        assertNotNull(category.getCreatedAt());

        Product product = new Product();
        product.setName("Laptop");
        product.setDescription("A high-end laptop");
        product.setPrice(1500.00);
        product.setStockQuantity(10);
        product.setImageUrl("http://example.com/laptop.jpg");
        product.setCreatedAt(LocalDateTime.now());
        product.setUpdatedAt(LocalDateTime.now());
        product.setCreatedBy(1L);
        product.setUpdatedBy(2L);
        product.setDeletedBy(null);
        product.setDeletedAt(null);

        assertNotNull(product);
        assertEquals("Laptop", product.getName());
        assertEquals(1500.00, product.getPrice());
        assertEquals(10, product.getStockQuantity());

        Setting setting = new Setting();
        setting.setSettingKey("theme");
        setting.setSettingValue("dark");

        assertNotNull(setting);
        assertEquals("theme", setting.getSettingKey());
        assertEquals("dark", setting.getSettingValue());

        User user = new User();
        user.setUsername("johndoe");
        user.setEmail("john@example.com");
        user.setPassword("securepassword");
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        user.setCreatedBy(1L);
        user.setUpdatedBy(2L);
        user.setDeletedBy(null);
        user.setDeletedAt(null);

        assertNotNull(user);
        assertEquals("johndoe", user.getUsername());
        assertEquals("john@example.com", user.getEmail());

    }
}
