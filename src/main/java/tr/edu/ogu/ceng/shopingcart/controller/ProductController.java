package tr.edu.ogu.ceng.shopingcart.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tr.edu.ogu.ceng.shopingcart.dto.ProductDto;
import tr.edu.ogu.ceng.shopingcart.service.ProductService;

@RestController
@RequestMapping("/API/v1/Product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;



    @GetMapping("/{id}")
    @Operation(summary = "Product çekme", description = "Product çekme")
    public ProductDto getProduct(@PathVariable Long id){

        return productService.getProduct(id);



    }





}
