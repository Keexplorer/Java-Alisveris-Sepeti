package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import tr.edu.ogu.ceng.shopingcart.entity.CartItem;
import tr.edu.ogu.ceng.shopingcart.repository.CartItemRepository;
import tr.edu.ogu.ceng.shopingcart.service.CartItemService;

@SpringBootTest
public class TestCartItemService extends Container{
    @Autowired
    CartItemService service;

    @MockBean
    CartItemRepository repository;

    @Test
    public void test(){
        CartItem cartItem = new CartItem();
        cartItem.setQuantity(1);
        service.saveCartItem(cartItem);
        System.out.println(cartItem.getQuantity());
        service.updateQuantity(2,cartItem);
        System.out.println(cartItem.getQuantity());
    }
}
