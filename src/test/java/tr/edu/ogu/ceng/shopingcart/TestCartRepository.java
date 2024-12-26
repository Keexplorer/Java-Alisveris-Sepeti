package tr.edu.ogu.ceng.shopingcart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.repository.CartRepository;

@SpringBootTest
public class TestCartRepository extends Container {

    @Autowired
    CartRepository repository;

    @Test
    public void test(){
        Cart cart = new Cart();
        cart.setUpdatedBy(1);
        repository.save(cart);
        if(repository.existsById(cart.getId())){
            System.out.println("cart var");
        }
        else{
            System.out.println("Cart yok");
        }
        repository.deleteById(cart.getId());

        if(repository.existsById(cart.getId())){
            System.out.println("cart var");
        }
        else{
            System.out.println("Cart yok");
        }
    }

}
