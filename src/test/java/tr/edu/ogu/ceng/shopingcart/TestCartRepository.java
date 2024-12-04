package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.repository.CartRepository;

@SpringBootTest
public class TestCartRepository extends Container{

    @Autowired
    CartRepository repository;

    @Test
    public void test(){
        Cart cart = new Cart();
        repository.save(cart);
    }

}
