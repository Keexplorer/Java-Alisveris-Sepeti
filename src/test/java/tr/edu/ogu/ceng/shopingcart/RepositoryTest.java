package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.repository.CartRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;
@DataJpaTest
public class RepositoryTest {
    @Autowired
    private CartRepository cartRepository;

    @Test
    public void testSaveAndFindCart() {
        Cart cart = new Cart();
        cart = cartRepository.save(cart);

        Optional<Cart> foundCart = cartRepository.findById(cart.getId());
        assertTrue(foundCart.isPresent());
    }
}
