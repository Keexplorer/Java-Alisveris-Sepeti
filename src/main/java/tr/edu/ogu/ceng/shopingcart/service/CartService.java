package tr.edu.ogu.ceng.shopingcart.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.dto.CartDto;
import tr.edu.ogu.ceng.shopingcart.entity.Cart;
import tr.edu.ogu.ceng.shopingcart.repository.CartRepository;

@Service
@RequiredArgsConstructor
public class CartService {


    private final CartRepository cartRepository;

    public CartDto getCart(Long id){
        Cart cart = cartRepository.getReferenceById(id);
        return convertToDto(cart);
    }

    public Cart saveCart(Cart cart){

        return cartRepository.save(cart);
    }

    private CartDto convertToDto(Cart cart) {
        CartDto cartDto = new CartDto();
        cartDto.setId(cart.getId());
        cartDto.setUser(cart.getUser());
        cartDto.setCartItems(cart.getCartItems());
        cartDto.setCreatedAt(cart.getCreatedAt());
        cartDto.setCreatedBy(cart.getCreatedBy());
        cartDto.setDeletedAt(cart.getDeletedAt());
        cartDto.setDeletedBy(cart.getDeletedBy());
        cartDto.setUpdatedAt(cart.getUpdatedAt());
        cartDto.setUpdatedBy(cart.getUpdatedBy());
        cartDto.setVersion(cart.getVersion());
        return cartDto;
    }

    public void deleteCart(Cart cart){
        cartRepository.deleteById(cart.getId());
    }

    public void updateCart(Cart cart){
        cartRepository.deleteById(cart.getId());
        cartRepository.save(cart);
    }

}
