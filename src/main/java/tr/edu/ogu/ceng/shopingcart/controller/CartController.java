package tr.edu.ogu.ceng.shopingcart.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.edu.ogu.ceng.shopingcart.dto.CartDto;
import tr.edu.ogu.ceng.shopingcart.service.CartService;

@RestController
@RequestMapping("/API/v1/Cart")
@RequiredArgsConstructor
public class CartController {
    private final CartService service;

    @GetMapping("/{id}")
    @Operation(summary = "Getting Cart", description = "Cart sınıfı buradan çekilir")
    public CartDto getSetting(@PathVariable Long id){

        return service.getCart(id);
    }
}
