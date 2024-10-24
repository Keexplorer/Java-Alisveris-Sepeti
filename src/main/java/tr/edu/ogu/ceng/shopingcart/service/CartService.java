package tr.edu.ogu.ceng.shopingcart.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.repository.CartRepository;

@Service
@RequiredArgsConstructor
public class CartService {


    private final CartRepository cartRepository;


    public Cart saveCart(Cart cart){

        return cartRepository.save(cart);
    }


}
