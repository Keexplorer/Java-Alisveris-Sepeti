package tr.edu.ogu.ceng.shopingcart.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.dto.CartItemDto;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.entity.CartItem;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
import tr.edu.ogu.ceng.shopingcart.repository.CartItemRepository;

@Service
@RequiredArgsConstructor
public class CartItemService {



    private final CartItemRepository cartItemRepository;
    public CartItemDto getCartItem(Long id){
        CartItem cartItem =cartItemRepository.getReferenceById(id);

        return convertToDto(cartItem);

    }


    public CartItem saveCartItem(CartItem cartItem){

        return cartItemRepository.save(cartItem);

    }
    private CartItemDto convertToDto(CartItem cartItem) {
        CartItemDto cartItemDto = new CartItemDto();
        cartItemDto.setCart(cartItem.getCart());
        cartItemDto.setProduct(cartItem.getProduct());
        cartItemDto.setQuantity(cartItem.getQuantity());
        cartItemDto.setCreatedAt(cartItem.getCreatedAt());
        cartItemDto.setCreatedBy(cartItem.getCreatedBy());
        cartItemDto.setDeletedAt(cartItem.getDeletedAt());
        cartItemDto.setDeletedBy(cartItem.getDeletedBy());
        cartItemDto.setUpdatedAt(cartItem.getUpdatedAt());
        cartItemDto.setUpdatedBy(cartItem.getUpdatedBy());
        cartItemDto.setId(cartItem.getId());
        cartItemDto.setVersion(cartItem.getVersion());
        return cartItemDto;

    }
}
