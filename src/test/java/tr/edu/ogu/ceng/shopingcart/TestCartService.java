package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.CartRepository;
import tr.edu.ogu.ceng.shopingcart.service.CartService;
@SpringBootTest
public class TestCartService {
    @Autowired
    CartService service;

    @Mock
    CartRepository repository;

    @Test
    public void test() {

        Cart cart = new Cart();
        service.saveCart(cart);
    }
}
