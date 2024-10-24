package tr.edu.ogu.ceng.shopingcart.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.entity.CartItem;
import tr.edu.ogu.ceng.shopingcart.repository.CartItemRepository;

@Service
@RequiredArgsConstructor
public class CartItemService {



    private final CartItemRepository cartItemRepository;


    public CartItem saveCartItem(CartItem cartItem){

        return cartItemRepository.save(cartItem);

    }
}
