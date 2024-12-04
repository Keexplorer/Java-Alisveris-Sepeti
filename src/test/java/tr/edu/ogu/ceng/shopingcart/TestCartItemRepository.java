package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.CartItem;
import tr.edu.ogu.ceng.shopingcart.repository.CartItemRepository;

@SpringBootTest
public class TestCartItemRepository extends Container {

    @Autowired
    CartItemRepository repository;

    @Test
    void test(){
        CartItem cartItem = new CartItem();
        cartItem.setQuantity(2);
        repository.save(cartItem);
    }

}
