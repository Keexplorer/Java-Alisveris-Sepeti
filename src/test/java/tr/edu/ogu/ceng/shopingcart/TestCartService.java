package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.repository.CartRepository;
import tr.edu.ogu.ceng.shopingcart.service.CartService;
@SpringBootTest
public class TestCartService extends Container{
    @Autowired
    CartService service;

    @MockBean
    CartRepository repository;

    @Test
    public void test() {

        Cart cart = new Cart();
        service.saveCart(cart);
    }
}
