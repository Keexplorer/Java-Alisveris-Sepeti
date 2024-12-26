package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.CartItem;
import tr.edu.ogu.ceng.shopingcart.repository.CartItemRepository;

@SpringBootTest
public class TestCartItemRepository extends Container {

    @Autowired
    CartItemRepository cartItemRepository;

    @Test
    void test(){
        CartItem cartItem = new CartItem();
        cartItem.setQuantity(2);
        cartItemRepository.save(cartItem);
        if (cartItemRepository.existsById(cartItem.getId()) ==true){

            System.out.println("CartItem var");
        }else{
            System.out.println("CartItem yok");
        }

        cartItemRepository.deleteById(cartItem.getId());

        if (cartItemRepository.existsById(cartItem.getId()) ==true){

            System.out.println("CartItem var");
        }else{
            System.out.println("CartItem yok");
        }
    }

}
