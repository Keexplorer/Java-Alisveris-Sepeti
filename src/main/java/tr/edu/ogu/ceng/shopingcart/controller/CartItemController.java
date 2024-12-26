package tr.edu.ogu.ceng.shopingcart.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.ogu.ceng.shopingcart.dto.CartItemDto;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.service.CartItemService;
import tr.edu.ogu.ceng.shopingcart.service.SettingService;

@RestController
@RequestMapping("/API/v1/CartItem")
@RequiredArgsConstructor
public class CartItemController {
    private final CartItemService cartItemService;

    @GetMapping("/{id}")
    @Operation(summary = "Example Endpoint for CartItem", description = "This is an example endpoint for demonstration purposes.")
    public CartItemDto getCartItem(@PathVariable Long id){

        return cartItemService.getCartItem(id);
    }

}
